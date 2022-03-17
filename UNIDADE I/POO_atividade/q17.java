package POO_atividade;

import java.util.Scanner;
/*
Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n . 
O mdc de m e n é definido recursivamente como segue:
se n > m, retorne mdc(n, m);
se n = 0, retorne m;
senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão.

*/
public class q17 {
    static int mdc(int n, int m) {
        if (n > m) {
        return mdc(n,m);
        }
        if (n == 0) {
        return m;
        } else {
        return mdc(n, m % n);
        }
        // OBS: escrita do jeito que você pediu dar erro, eu tenho ela feita de outro
        // jeito que fiz em C. Abaixo
        // if (n == m)
        //     return n;
        // if (n > m)
        //     return mdc(n - m, m);
        // else
        //     return mdc(n, m - n);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, m;
        System.out.println("Digite dois numeros mdc(n,m): ");
        n = entrada.nextInt();
        m = entrada.nextInt();
        System.out.println("mdc = " + mdc(n, m));
    }
}
