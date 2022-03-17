package POO_atividade;

import java.util.Scanner;
/*
Escreva um programa que lê um número que representa o valor da carta, de um (ás) 
a treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e
4 = espadas). O programa deve imprimir o nome da carta por extenso
*/
public class q7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int carta, naipe;
        String recebeCarta, recebeNaipe;
        System.out.println("Digite um valor para uma carta de 1 a13:");
        carta = entrada.nextInt();
        System.out.println("Digite um naipe de 1 a 4");
        naipe = entrada.nextInt();
        if (carta == 1) {
            recebeCarta = "Ás A";
        } else if (carta == 11) {
            recebeCarta = "Valete J";
        } else if (carta == 12) {
            recebeCarta = "Rainha Q";
        } else if (carta == 13) {
            recebeCarta = "Rei K";
        } else {
            recebeCarta = Integer.toString(carta);
        }
        if (naipe == 1) {
            recebeNaipe = "Ouros";
        }else if(naipe ==2){
            recebeNaipe = "Paus";
        }else if(naipe ==3){
            recebeNaipe = "Copas";
        }else{
            recebeNaipe = "Espadas";
        }
        System.out.println(recebeCarta + " de " + recebeNaipe);
    }

}
