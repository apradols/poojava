package com.anna.projetocomputador;

import java.util.Objects;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("Marca :" + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de Série: " + numeroSerie);
        System.out.println("Preço: " + preco);
    }
    public void calcularValor(){
        if (Objects.equals(marca,"hp")){
            preco += (preco * 0.30);
        }
        if (Objects.equals(marca, "ibm")){
            preco += (preco * 0.50);
        }

        System.out.println("Preço: " + preco);
    }

    public int alterarValor(double precoAlt){
        if(precoAlt > 0) {
            preco = precoAlt;
            return 1;
        }
        else{
            return 0;
        }
    }
}
