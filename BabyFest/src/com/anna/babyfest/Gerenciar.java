package com.anna.babyfest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Gerenciar {
    static int id = 1;
    static Scanner input = new Scanner(System.in);
    static List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n-----Funcionário-----\n");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Alterar funcionário");
            System.out.println("3 - Excluir funcionário");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma das opções: ");
            option = input.nextInt();

            switch(option) {
                case 1: cadastrarFuncionario();
                    break;
                case 2: alterarFuncionario();
                    break;
                case 3: excluirFuncionario();
                    break;
                case 4: sair();
                    break;
                default:
                    System.err.println("\nOpção inválida!\n");
                    break;
            }
        } while(option != 4);
    }

    public static void preencherDados(Funcionario f) {
        System.out.println("Por favor, digite o nome do Funcionário: ");
        if (input.hasNextLine()) {
            String nome = input.nextLine();
            f.setNome(nome);
        }
        String nome = input.nextLine();
        f.setNome(nome);

        System.out.println("Agora, em qual setor " + f.getNome() + " trabalhará?");
        String setor = input.nextLine();
        f.setSetor(setor);

        System.out.println("E quanto " + f.getNome() + " ganhará por mês?");
        try {
            if (input.hasNextLine()) {
                double salario = input.nextDouble();
                f.setSalario(salario);
            }
        } catch (InputMismatchException e) {
            System.err.println("\nSalário inválido! Por favor, digite apenas números!\n");
            input.nextLine();
            main(null);
        }
    }

    public static void listaFuncionarios() {
        System.out.println("\nLista de Funcionários\n");
        for (Funcionario f : funcionarios) {
            f.imprimirFuncionario();
        }
    }

    public static boolean erroIDFuncionario(int idFunc) {
        try {
            for (Funcionario f : funcionarios) {
                if (idFunc == f.getId()) {
                    return true;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite o ID do funcionário!");
            input.nextLine();
        }
        return false;
    }

    public static void cadastrarFuncionario() {
        Funcionario f = new Funcionario();
        System.out.println("\nCadastramento de Funcionário\n");

        f.setId(id);

        preencherDados(f);

        funcionarios.add(f);
        id += 1;

        System.out.println("\nFuncionário cadastrado!\n");
        f.imprimirFuncionario();
    }

    public static void alterarFuncionario() {
        if (funcionarios.size() <= 0) {
            System.err.println("\nA empresa não possui candidatos válidos para a alteração!\n");
        } else {
            System.out.println("\nAlteração de dados\n");
            listaFuncionarios();
            System.out.println("Escolha o funcionário a ser alterado por ID: ");
            int idFunc = input.nextInt();
            if (erroIDFuncionario(idFunc)) {
                for (Funcionario f : funcionarios) {
                    if (idFunc == f.getId()) {
                        preencherDados(f);
                        break;
                    }
                }
            }
        }
    }

    public static void excluirFuncionario() {
        if (funcionarios.size() <= 1) {
            System.err.println("\nA empresa não possui candidatos válidos para a exclusão!\n");
        } else {
            listaFuncionarios();
            System.out.println("Escolha o funcionário que deseja excluir por ID: ");
            int idFunc = input.nextInt();
            if (erroIDFuncionario(idFunc)) {
                for (Funcionario f : funcionarios) {
                    if (idFunc == f.getId()) {
                        funcionarios.remove(f);
                        break;
                    }
                }
            }
        }
    }

    public static void sair() {
        System.out.println("Saindo do Sistema...");
        System.exit(0);
    }
}