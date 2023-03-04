/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiagoenriquez.avaliacao3.numero;

/**
 *
 * @author tiago
 */
public class Colecao {
    
    protected Numero ultimo;
    protected int celulas;
    protected int celulasPreenchidas;

    public Colecao(int celulas) {
        this.celulas = celulas;
        celulasPreenchidas = 0;
    }
    
    public void inserir(Numero numero) {
        if (celulasPreenchidas < celulas) {
            numero.setIndice(celulasPreenchidas);
            numero.setAntecessor(ultimo);
            ultimo = numero;
            celulasPreenchidas++;
        }
    }
    
    private Numero comparar(int indice, Numero numero) {
        if (indice != numero.getIndice()) {
            return comparar(indice, numero.getAntecessor());
        }
        return numero;
    }
    
    public Numero pesquisar(int indice) {
        return comparar(indice, ultimo);
    }

    public int getCelulasPreenchidas() {
        return celulasPreenchidas;
    }
    
}
