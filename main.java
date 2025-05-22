package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores a serem inseridos na árvore (separados por espaço):");
        String linha = scanner.nextLine();
        String[] valores = linha.split(" ");

        for (String val : valores) {
            try {
                int numero = Integer.parseInt(val);
                arvore.inserir(numero);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido ignorado: " + val);
            }
        }

        System.out.println("\nPercursos da árvore:");
        arvore.percorrerPreOrdem();
        arvore.percorrerPosOrdem();
    }
}
