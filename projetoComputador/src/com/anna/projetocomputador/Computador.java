package com.anna.projetocomputador;

import java.util.Objects;

public class Computador {
    private String marca;
    private String cor;
    private String modelo;
    private long numeroSerie;
    private double preco;

    public void imprimir(){
        System.out.println("Marca :" + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de Série: " + getNumeroSerie());
        System.out.println("Preço: " + getPreco());
    }
    public void calcularValor(){
        if (Objects.equals(getMarca(),"hp")){
            setPreco(getPreco() + (getPreco() * 0.30));
        }
        if (Objects.equals(getMarca(), "ibm")){
            setPreco(getPreco() + (getPreco() * 0.50));
        }

        System.out.println("Preço: " + getPreco());
    }

    public int alterarValor(double precoAlt){
        if(precoAlt > 0) {
            setPreco(precoAlt);
            return 1;
        }
        else{
            return 0;
        }
    }

    private String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    private String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private long getNumeroSerie() {
        return numeroSerie;
    }

    private void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    private double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }
}