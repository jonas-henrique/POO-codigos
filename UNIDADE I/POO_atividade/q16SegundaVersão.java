package POO_atividade;

import java.util.Scanner;
/*
Esse foi o primeiro modelo que eu fiz, caso avalie faça pelo outro que está mais completo
*/
public class q16SegundaVersão {
    static int fatorar(int numero, int[] vet) {

        if (numero == 0) {
            return 1;
        } else {
            vet[numero - 1] = numero;
            return numero * fatorar(numero - 1, vet);
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        int vet[] = new int[numero];
        int valor = fatorar(numero, vet);
        for (int i = numero - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(vet[i] + " * ");
            } else {
                System.out.print(vet[i]);
            }
        }
        System.out.print(" = " + valor + "\n");

    }

}
