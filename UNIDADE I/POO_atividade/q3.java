package POO_atividade;

import java.util.Scanner;
/*
Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. Divulgue 
também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.
*/
public class q3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double angulo;
        angulo = entrada.nextDouble();
        double radiano =Math.toRadians(angulo);
        double seno = Math.sin(radiano);
        double cosseno = Math.cos(radiano);
        double tangente = Math.tan(radiano);
        double secante = 1/Math.cos(radiano);
        double cossecante = 1/ Math.sin(radiano);
        double cotangente = 1/ Math.tan(radiano);

        System.out.println("Radiano: 2.%f"+radiano);
        System.out.println("Seno: "+seno);
        System.out.println("Cosseno: "+ cosseno);
        System.out.println("Tangente: "+ tangente);
        System.out.println("Secante: "+secante);
        System.out.println("Cossecante: "+cossecante);
        System.out.println("Cotangente: "+ cotangente);


    }
}
