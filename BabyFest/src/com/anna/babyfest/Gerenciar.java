package com.anna.babyfest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciar {

    public  static Funcionario exibirf;
    private final Scanner input = new Scanner(System.in);
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Funcionario> funcionarios = new ArrayList<>();
    private final List<Fornecedor> fornecedores = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Gerenciar gerenciar = new Gerenciar();
        exibirf = new Funcionario();
        Scanner input = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("-----Funcionário----- ");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Alterar funcionário");
            System.out.println("3 - Excluir funcionário");
            System.out.println("-----Usuário-----");
            System.out.println("4 - Cadastrar usuário");
            System.out.println("5 - Alterar usuário");
            System.out.println("6 - Excluir usuário");
            System.out.println("-----Cliente-----");
            System.out.println("7 - Cadastrar cliente");
            System.out.println("8 - Alterar cliente");
            System.out.println("9 - Excluir cliente");
            System.out.println("-----Fornecedor-----");
            System.out.println("10 - Cadastrar fornecedor");
            System.out.println("11 - Alterar fornecedor");
            System.out.println("12 - Excluir fornecedor");
            System.out.println("13 - Exibir funcionário");
            System.out.println("14 - Sair");
            System.out.println("Escolha uma das opções: ");
            op = Integer.parseInt(input.nextLine());
            switch (op) {
                case 1:
                    gerenciar.cadastrarFuncionario();
                    break;
                case 2:
                    gerenciar.alterarFuncionario();
                    break;
                case 3:
                    gerenciar.excluirFuncionario();
                    break;
                case 4:
                    gerenciar.cadastrarUsuario();
                    break;
                case 5:
                    gerenciar.alterarUsuario();
                    break;
                case 6:
                    gerenciar.excluirUsuario();
                    break;
                case 7:
                    gerenciar.cadastrarCliente();
                    break;
                case 8:
                    gerenciar.alterarCliente();
                    break;
                case 9:
                    gerenciar.excluirCliente();
                    break;
                case 10:
                    gerenciar.cadastrarFornecedor();
                    break;
                case 11:
                    gerenciar.alterarFornecedor();
                    break;
                case 12:
                    gerenciar.excluirFornecedor();
                    break;
                case 13:
                    gerenciar.exibirlista();
                    break;
                case 14:
                    System.out.println("Saindo do Sistema...");
                    break;

                default:
                    System.out.println("Opção Inválida," +
                            "Escolha outra opção! ");
            }
        } while (op != 14);
    }


    Funcionario funcionario = new Funcionario();
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
// métodos

    public void cadastrarFuncionario(){
        System.out.println("Digite o ID do funcionário:");
        funcionario.setId(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o nome do funcionário:");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite o setor do funcionário:");
        funcionario.setSetor(input.nextLine());
        System.out.println("Digite o salário do funcionário:");
        funcionario.setSalario(Double.parseDouble(input.nextLine()));
        funcionarios.add(funcionario);
    }

    public void alterarFuncionario(){
Funcionario funcionarioproc = new Funcionario();
        for (int i = 1; i < funcionarios.size(); i++) {
            System.out.println("LISTA DE funcionarios  \n" + funcionarios);
        }

        if(funcionarios.contains(funcionarioproc)){
           funcionarioproc.equals(funcionario);
           excluirFuncionario();


        }
        System.out.println("Alterando dados");
        System.out.println("Digite o ID do funcionário:");
        funcionario.setId(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o nome do funcionário:");
        funcionario.setNome(input.nextLine());
        System.out.println("Digite o setor do funcionário:");
        funcionario.setSetor(input.nextLine());
        System.out.println("Digite o salário do funcionário:");
        funcionario.setSalario(Double.parseDouble(input.nextLine()));
        funcionarios.add(funcionario);

        }



    public void excluirFuncionario(){
        System.out.println("Digite o ID do funcionário:");
        funcionario.setId(Integer.parseInt(input.nextLine()));

        funcionarios.remove(funcionario);
    }
    public void exibirlista() {
        for (Funcionario funcionario : exibirf.getExibirf()) {
            System.out.println("Id: " + funcionarios.get(funcionario.getId()));
         //   System.out.println("Nome: " + funcionarios.get(funcionario.getNome()));
          //  System.out.println("Setor: " + funcionarios.get(funcionario.getSetor()));
           // System.out.println("Salario: " + funcionario.getSalario());
        }
    }
    private void cadastrarUsuario() {
    }

    private void alterarUsuario() {
    }

    private void excluirUsuario() {
    }

    private void cadastrarCliente() {
    }

    private void alterarCliente() {
    }

    private void excluirCliente() {
    }

    private void cadastrarFornecedor() {
    }

    private void alterarFornecedor() {
    }

    private void excluirFornecedor() {
    }
}
