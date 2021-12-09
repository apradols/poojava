package com.anna.babyfest;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int id;
    private String nome;
    private String setor;
    private double salario;

    private List<Funcionario> exibirf = new ArrayList<>();

    public List<Funcionario> getExibirf() {
        return exibirf;
    }

    public void exibirLista(Funcionario exibirf){
        Gerenciar.exibirf.exibirLista(exibirf);
    }

    public Funcionario(int id, String nome, String setor, double salario) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}