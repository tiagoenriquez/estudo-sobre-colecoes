/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiagoenriquez.avaliacao3.numero;

/**
 *
 * @author tiago
 */
public class Pilha extends Colecao {
    
    public Pilha(int celulas) {
        super(celulas);
    }
    
    public Numero remover() {
        Numero removido = ultimo;
        ultimo = ultimo.getAntecessor();
        celulasPreenchidas--;
        return removido;
    }
    
}
