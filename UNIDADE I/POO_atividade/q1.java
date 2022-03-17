package POO_atividade;

import java.util.Scanner;

/* Área de um quadrado
A = L*L
*/
public class q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float l;

        System.out.print("Digite o valor do lado do quadrao: ");
        l = entrada.nextFloat();

        float a = l*l; 
        System.out.println("Área do quadrado: "+a);
    }
}
