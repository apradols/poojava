package com.anna.babyfest;

public class Funcionario {
    private int id;
    private String nome;
    private String setor;
    private double salario;

    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setSetor(String setor) { this.setor = setor; }
    public String getSetor() { return setor; }

    public void setSalario(double salario) { this.salario = salario; }
    public double getSalario() { return salario; }

    public void imprimirFuncionario() {
        System.out.println("ID do Funcionário: " + id);
        System.out.println("Nome do Fucionário: " + nome);
        System.out.println("Setor do Funcionário: " + setor);
        System.out.println("Salário do Funcionário: " + salario + "\n");
    }
}
