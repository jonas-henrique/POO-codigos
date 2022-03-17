package POO_atividade;

import java.util.Scanner;
/*
Verificar se um numero N é primo
*/
public class q18 {
    static int primo(int numero, int contador) {
        // primeiro primo = 2
         if (contador == numero/2 || numero ==2)  {
                return 0;
        } else if (numero % contador == 0) {
            return 1;                   
        } else {
            contador++;
            return primo(numero, contador);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Digite um número:");
        n = entrada.nextInt();
        if (primo(n, 2) == 1) {
            System.out.println(n + " não é primo.");

        } else {
            System.out.println(n + " é primo.");

        }
    }

}
