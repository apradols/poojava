package com.anna.projetocomputador;

public class ComputadorTeste {

    public static void main(String[] args) {
        Computador computadorImb, computadorHp;

        computadorImb = new Computador();

        computadorImb.marca = "IBM";
        computadorImb.cor = "Preto";
        computadorImb.modelo = "IBM";
        computadorImb.numeroSerie = 243490;
        computadorImb.preco = 2734.60;
        computadorImb.imprimir();

        computadorImb.calcularValor();
        computadorImb.imprimir();

        computadorHp = new Computador();

        computadorHp.marca = "Hp";
        computadorHp.cor = "Preto";
        computadorHp.modelo = "Hp";
        computadorHp.numeroSerie = 57864;
        computadorHp.preco = 1500.50;
        computadorHp.imprimir();

        computadorHp.calcularValor();
        computadorHp.imprimir();

        int precoAlt = computadorImb.alterarValor(76656.33);
            if(precoAlt == 1){
                System.out.println("valor alterado");
            }
            else{
                System.out.println("valor não Alterado");
            }
            computadorImb.imprimir();

    }
}
