package com.anna.projetocomputador;

public class ComputadorTeste {

    public static void main(String[] args) {
        Computador computadorImb, computadorHp;

        computadorImb = new Computador();

        computadorImb.setMarca("IBM");
        computadorImb.setCor("Preto");
        computadorImb.setModelo("IBM");
        computadorImb.setNumeroSerie(243490);
        computadorImb.setPreco(2734.60);
        computadorImb.imprimir();

        computadorImb.calcularValor();
        computadorImb.imprimir();

        computadorHp = new Computador();

        computadorHp.setMarca("Hp");
        computadorHp.setCor("Preto");
        computadorHp.setModelo("Hp");
        computadorHp.setNumeroSerie(57864);
        computadorHp.setPreco(1500.50);
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
