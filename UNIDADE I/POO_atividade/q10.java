package POO_atividade;

import java.util.Scanner;
/*
CARTÃO DA MEGA SENA
*/
public class q10 {
    public static void main(String[] args) {
        System.out.print("\t\tCARTÃO DA MEGA SENA\n\n");
        for(int i =1; i<=60; i++){
            if(i<10){
                System.out.print("["+i+" ] ");
            }else{
                System.out.print("["+i+"] ");
            }
            if(i%10 == 0){
                System.out.print("\n");

            }
        }
    }
}
