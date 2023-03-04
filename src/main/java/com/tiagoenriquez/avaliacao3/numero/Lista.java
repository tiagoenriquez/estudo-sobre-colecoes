/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiagoenriquez.avaliacao3.numero;

/**
 *
 * @author tiago
 */
public class Lista extends Colecao {

    public Lista(int celulas) {
        super(celulas);
    }
    
    public Numero remover(int indice) {
        Numero removido = pesquisar(indice);
        if (indice < celulasPreenchidas - 1) {
            pesquisar(indice + 1).setAntecessor(removido.getAntecessor());
        } else {
            ultimo = ultimo.getAntecessor();
        }
        for (int i = indice + 1; i < celulasPreenchidas; i++) {
            Numero numero = pesquisar(i);
            numero.setIndice(numero.getIndice() - 1);
        }
        celulasPreenchidas--;
        return removido;
    }
    
}
