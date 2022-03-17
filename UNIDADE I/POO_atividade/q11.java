package POO_atividade;

import java.util.Scanner;
/*
    Sequencia de fib de n>1(comeca do 1 até o n-śeimo termo)
*/
public class q11 {
    static int calcfib(int nesimo) {
        int n = 1, ultimo = 0, i = 0;
        while (i <= nesimo) {
            if (i == 1) {
                ultimo = 0;
            }
            n = n + ultimo;
            ultimo = n - ultimo;

            i++;
        }
        return ultimo;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Digite o n-ésimo termo: ");
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(calcfib(i) + " ");
        }
        System.out.print("\n");

    }

}
