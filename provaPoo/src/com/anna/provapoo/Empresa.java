package com.anna.provapoo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private int idEmpresa;
    private String razaoSocial;
    private String cnpj;
    private List<Funcionario> empregados;

    public Empresa(){
        idEmpresa = -1;
        razaoSocial = "";
        cnpj = "";
        empregados = new ArrayList<>();
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Funcionario> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Funcionario> empregados) {
        this.empregados = empregados;
    }

    public void adicionarEmpregados(Funcionario f) {
        empregados.add(f);
    }

    public void mostrarEmpregados() {
        for (Funcionario f : empregados) {
            f.imprimir();
        }
    }

    public boolean contemFuncionario(Funcionario func) {
        for (Funcionario f : empregados) {
            if (func.getIdFuncionario() == f.getIdFuncionario()) {
                return true;
            }
        }
        return false;
    }

    public void demitirEmpregado(Funcionario func) {
        for (Funcionario f : empregados) {
            if (func.getIdFuncionario() == f.getIdFuncionario()) {
                f.setEstaAtivo(false);
                break;
            }
        }
    }

    public void mostrarEmpregadosAtivos() {
        for (Funcionario f: empregados) {
            if(f.isEstaAtivo()) {
                f.imprimir();
            }
        }
    }

}

