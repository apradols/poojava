package com.anna.provapoo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class GerenciarFuncionario {

    private List<Funcionario> listaFuncionario = new ArrayList<>();
    private List<Empresa> listaEmpresa = new ArrayList<>();


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciarFuncionario gf = new GerenciarFuncionario();
        int opcao = 0;
        do {
            System.out.println("1 - Cadastrar funcionário: ");
            System.out.println("2 - Cadastrasr empresa: ");
            System.out.println("3 - Atualizar salário: ");
            System.out.println("4 - Demitir funcionário: ");
            System.out.println("5 - Listar funcionários de uma empresa: ");
            System.out.println("6 - Listar todos os funcionários");
            System.out.println("7 - Adicionar funcionário");
            System.out.println("8 - Verificar existência de funcionário: ");
            System.out.println("9 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1:
                    gf.cadastrarFuncionario();
                    break;
                case 2:
                    gf.cadastrarEmpresa();
                    break;
                case 3:
                    gf.atualizarSalario();
                    break;
                case 4:
                    gf.demitirFuncionarios();
                    break;
                case 5:
                    gf.listarFuncionarioUmaEmpresa();
                    break;
                case 6:
                    gf.listarFuncionarioEmpresas();
                    break;
                case 7:
                    gf.adicionarFuncionario();
                    break;
                case 8:
                    gf.verificarFuncionario();
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção Inválida, Por favor escolha outra opção!");
            }
        } while (opcao != 9);
    }

    // coisinha que eu sei pra que serve

    public void cadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID do funcionário: ");
        funcionario.setIdFuncionario(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o nome do funcionário: ");
        funcionario.setNomeFuncionario(input.nextLine());
        System.out.println("Digite o departamento do funcionário: ");
        funcionario.setDepartamento(input.nextLine());
        System.out.println("Digite o salário do funcionário: ");
        funcionario.setSalario(Double.parseDouble(input.nextLine()));
        System.out.println("Digite a data da contratação do funcionário: ");
        funcionario.setDataContratacao(LocalDate.now());
        System.out.println("Digite o documento do funcionário: ");
        funcionario.setDocumento(input.nextLine());
        funcionario.setEstaAtivo(true);
        listaFuncionario.add(funcionario);
    }

    public void cadastrarEmpresa() {
        Empresa empresa = new Empresa();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID da empresa: ");
        empresa.setIdEmpresa(Integer.parseInt(input.nextLine()));
        System.out.println("Digite a razão social da empresa: ");
        empresa.setRazaoSocial(input.nextLine());
        System.out.println("Digite o cnpj da empresa: ");
        empresa.setCnpj(input.nextLine());
        listaEmpresa.add(empresa);
    }

    public void atualizarSalario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID do funcionario: ");
        int idBusca = Integer.parseInt(input.nextLine());
        for (Funcionario f : listaFuncionario) {
            if (idBusca == f.getIdFuncionario()) {
                System.out.println("Digite o salário atualizado: ");
                double salarioNovo = input.nextDouble();
                f.setSalario(salarioNovo);
                break;
            }
        }
    }

    public void demitirFuncionarios() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID do funcionario: ");
        int idBusca = Integer.parseInt(input.nextLine());
        for (Funcionario f : listaFuncionario) {
            if (idBusca == f.getIdFuncionario()) {
                System.out.println("Demitir funcionario: ");
                f.demitirFuncionario();
                break;
            }
        }
    }

    public void listarFuncionarioUmaEmpresa() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o CNPJ da empresa: ");
        String cnpj = input.nextLine();
        for (Empresa e : listaEmpresa) {
            if (e.getCnpj().equals(cnpj)) {
                e.mostrarEmpregados();
            } else {
                System.out.println("ID Invalido");
            }
        }
    }

    public void listarFuncionarioEmpresas() {
        for (Funcionario f : listaFuncionario) {
            if (f != null) {
                f.imprimir();
            }
        }
    }

    public void adicionarFuncionario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o CNPJ da empresa: ");
        String cnpj = input.nextLine();
        System.out.println("Digite o ID do funcionário: ");
        int idBuscaFunc = Integer.parseInt(input.nextLine());
        for (Empresa e : listaEmpresa) {
            if (e.getCnpj().equals(cnpj)) {
                for (Funcionario f : listaFuncionario) {
                    if (f.getIdFuncionario() == idBuscaFunc) {
                        e.adicionarEmpregados(f);
                        return;
                    }
                }
            }
        }
    }

    public void verificarFuncionario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID da Funcionario: ");
        int idBusca = Integer.parseInt(input.nextLine());
        System.out.println("Digite o CNPJ da empresa: ");
        String cnpj = input.nextLine();
        for (Empresa e : listaEmpresa) {
            if (e.getCnpj().equals(cnpj)) {
                for (Funcionario f : e.getEmpregados()) {
                    if (f.getIdFuncionario() == idBusca) {
                        System.out.println("Esta Ativo? " + f.isEstaAtivo());
                        return;
                    }
                }
            }
        }

        System.out.println("Funcionario Não Encontrado ");

    }
}