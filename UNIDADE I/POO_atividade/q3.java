package POO_atividade;

import java.util.Scanner;

public class q3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int angulo;
        angulo = entrada.nextInt();
        System.out.println("RAD: "+Math.toRadians(angulo)+"\nSEN: "+Math.sin(angulo)+"\nCOS: "+ Math.cos(angulo));
    }
}
