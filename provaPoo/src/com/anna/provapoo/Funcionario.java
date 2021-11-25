package com.anna.provapoo;

import java.time.LocalDate;

public class Funcionario {


    private int idFuncionario;
    private String nomeFuncionario;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean estaAtivo;

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void atualizarSalario(double valor){
        salario +=valor;
    }

    public void demitirFuncionario(){
        if(estaAtivo){
            estaAtivo = false;
        }
    }

    public void imprimir(){
        System.out.println("Dados do funcionário: ");
        System.out.println("ID: " + idFuncionario);
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("Salário: " + salario);
        System.out.println("Documentos: " + documento);
        System.out.println("Ativo: " + estaAtivo);
    }

}
