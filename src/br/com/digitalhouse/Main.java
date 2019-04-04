package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Integer umNumeroA;
    Double umNumeroB;
    String umaCadeiaDeTexto;

    umNumeroA = 10;
    umNumeroB = 20.0;
    umaCadeiaDeTexto = "HOLLA QUE TAL?!?!?";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("A soma é: " +(umNumeroA + umNumeroB));

        System.out.println("A diferença é: " +(umNumeroA - umNumeroB));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        umNumeroA = scanner.nextInt();
        System.out.println("Recebi: " + umNumeroA);



    }
}
