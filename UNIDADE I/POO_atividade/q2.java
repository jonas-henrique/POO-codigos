package POO_atividade;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Float x,y,z,soma,media;
        System.out.println("Digite 3 números susseviamente:");
        x = entrada.nextFloat();
        y = entrada.nextFloat();
        z = entrada.nextFloat();
        soma = x+y+z;
        media = soma/3;

        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
    


    }
}
