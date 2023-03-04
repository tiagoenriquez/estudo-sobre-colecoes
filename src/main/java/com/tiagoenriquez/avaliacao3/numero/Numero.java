/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiagoenriquez.avaliacao3.numero;

/**
 *
 * @author tiago
 */
public class Numero {
    
    private int valor;
    private int indice;
    private Numero antecessor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    protected int getIndice() {
        return indice;
    }

    protected Numero getAntecessor() {
        return antecessor;
    }

    protected void setValor(int valor) {
        this.valor = valor;
    }

    protected void setIndice(int indice) {
        this.indice = indice;
    }

    protected void setAntecessor(Numero antecessor) {
        this.antecessor = antecessor;
    }
    
}
