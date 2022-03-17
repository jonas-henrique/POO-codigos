package POO_atividade;

import java.util.Scanner;

public class q16 {
    static int fatorar(int numero, int cont) {
        int resultado;
        if (numero == 0) {
            return 1;
        } else {
            cont++;
            resultado = numero * fatorar(numero - 1, cont);

            for (int i = 0; i < cont; i++) {
                System.out.print("\t");
            }

            System.out.print(numero + "° saida ->" + resultado / numero + "*" + (numero) +
                    " = " + resultado + "\n");

        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont = 0;
        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        int valor = fatorar(numero, cont);

        System.out.print(numero + "! = " + valor + "\n");

    }
}
