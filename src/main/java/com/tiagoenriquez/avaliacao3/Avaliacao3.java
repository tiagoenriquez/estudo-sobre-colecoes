/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tiagoenriquez.avaliacao3;

import com.tiagoenriquez.avaliacao3.numero.Colecao;
import com.tiagoenriquez.avaliacao3.numero.Fila;
import com.tiagoenriquez.avaliacao3.numero.Lista;
import com.tiagoenriquez.avaliacao3.numero.Numero;
import com.tiagoenriquez.avaliacao3.numero.Pilha;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Avaliacao3 {

    public static void main(String[] args) {
        Lista lista = passo1();
        Pilha pilha = passo2(lista);
        Fila fila = new Fila(10);
        fila = passo3(pilha, fila);
        lista = passo4(lista);
        pilha = passo2(lista);
        fila = passo3(pilha, fila);
        mostrar(fila);
    }
    
    private static Lista passo1() {
        Lista lista = new Lista(5);
        lista.inserir(new Numero(0));
        lista.inserir(new Numero(1));
        lista.inserir(new Numero(2));
        lista.inserir(new Numero(3));
        lista.inserir(new Numero(4));
        return lista;
    }
    
    private static Pilha passo2(Lista lista) {
        Pilha pilha = new Pilha(5);
        int tamanho = lista.getCelulasPreenchidas();
        for (int i = 0; i < tamanho; i++) {
            pilha.inserir(lista.remover(0));
        }
        return pilha;
    }
    
    private static Fila passo3(Pilha pilha, Fila fila) {
        int tamanho = pilha.getCelulasPreenchidas();
        for (int i = 0; i < tamanho; i++) {
            fila.inserir(pilha.remover());
        }
        return fila;
    }
    
    private static Lista passo4(Lista lista) {
        lista.inserir(new Numero(6));
        lista.inserir(new Numero(7));
        lista.inserir(new Numero(8));
        lista.inserir(new Numero(9));
        lista.inserir(new Numero(10));
        return lista;
    }
    
    private static void mostrar(Colecao colecao) {
        String mensagem = "Ordem dos elementos na fila:\n";
        for (int i = 0; i < colecao.getCelulasPreenchidas(); i++) {
            mensagem += " " + colecao.pesquisar(i).getValor();
        }
        JOptionPane.showMessageDialog(
                null,
                mensagem,
                "Estudo sobre Coleções",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
