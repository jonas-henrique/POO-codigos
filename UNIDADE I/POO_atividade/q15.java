package POO_atividade;

import java.util.Scanner;
/*
Crie uma função recursiva potencia(base,expoente) que, quando chamado, retorna base^expoente.
Por exemplo, potencia(3,4) = 3 * 3 * 3 * 3.

*/
public class q15 {
    static int exponencial(int x, int p) {
        // x^p
        if (p == 0) {
            return 1;
        } else if (p == 1) {
            return x;
        }else{
            return x*exponencial(x,p-1);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x,p;
        System.out.println("Digite dois numeros para Exp(x,p): ");
        x = entrada.nextInt();
        p = entrada.nextInt();
        System.out.println("Potencia("+x+","+p+"): "+exponencial(x, p));
    }
}
