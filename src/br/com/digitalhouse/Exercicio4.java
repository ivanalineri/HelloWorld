package br.com.digitalhouse;


public class Exercicio4 {
    public static void main(String[] args) {
        int[] soma;
        soma = new int[4];
        soma[0] = 1;
        soma[1] = 2;
        soma[2] = 4;
        soma[3] = 5;

       //System.out.println((soma[0])+(soma[1])+(soma[2])+soma[3]);
        for( int i = 0; i < soma.length; i++){
            soma = soma + soma[i]
        }
        System.out.println(soma);
    }
}
