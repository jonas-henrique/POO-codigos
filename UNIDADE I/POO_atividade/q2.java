package POO_atividade;

import java.util.Scanner;

/*
Escreva um programa que calcule a soma e a média 
aritmética de 3 números. Os 3 valores reais serão informados pelo usuário.
*/
public class q2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Float x, y, z, soma, media;
        System.out.println("Digite 3 números susseviamente:");
        x = entrada.nextFloat();
        y = entrada.nextFloat();
        z = entrada.nextFloat();
        soma = x + y + z;
        media = soma / 3;
        // se preferir pode colocar isso em um vetor para diminuir as linhas e ficar
        // até melhor
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
