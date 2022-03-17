package POO_atividade;

import java.util.Scanner;

/* Área de um quadrado
A = L*L
*/
public class q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float L;

        System.out.print("Digite o valor do lado do quadrao: ");
        L = entrada.nextFloat();

        float A = L*L;
        System.out.println("Área do quadrado: "+A);
    }
}
