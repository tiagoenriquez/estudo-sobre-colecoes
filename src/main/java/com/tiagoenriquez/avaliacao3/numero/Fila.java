/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiagoenriquez.avaliacao3.numero;

/**
 *
 * @author tiago
 */
public class Fila extends Colecao {
    
    public Fila(int celulas) {
        super(celulas);
    }
    
    public Numero remover() {
        Numero removido = pesquisar(0);
        for (int i = 1; i < celulasPreenchidas; i++) {
            pesquisar(i).setIndice(i - 1);
        }
        celulasPreenchidas--;
        return removido;
    }
    
}
