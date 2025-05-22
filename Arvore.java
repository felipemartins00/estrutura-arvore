package com.company;

public class Arvore {
    No raiz;


    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }

        return no;
    }


    public int contarNos() {
        return contarNosRecursivo(raiz);
    }

    private int contarNosRecursivo(No no) {
        if (no == null) {
            return 0;
        }

        return 1 + contarNosRecursivo(no.esquerda) + contarNosRecursivo(no.direita);
    }


    public void percorrerPreOrdem() {
        System.out.print("Pré-ordem: ");
        percorrerPreOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerPreOrdemRecursivo(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            percorrerPreOrdemRecursivo(no.esquerda);
            percorrerPreOrdemRecursivo(no.direita);
        }
    }
    public void percorrerPosOrdem() {
        System.out.print("Pós-ordem: ");
        percorrerPosOrdemRecursivo(raiz);
        System.out.println();
    }

    private void percorrerPosOrdemRecursivo(No no) {
        if (no != null) {
            percorrerPosOrdemRecursivo(no.esquerda);
            percorrerPosOrdemRecursivo(no.direita);
            System.out.print(no.valor + " ");
        }
    }

}
