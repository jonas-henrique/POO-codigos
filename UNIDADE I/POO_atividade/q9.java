package POO_atividade;

import java.util.Scanner;
/**
 Verifica se o ponto p2 está a direita, esqueda, abaixo ou acima de p1
 */
public class q9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.print("Digite o ponto p1(x,y): ");
        x1 = entrada.nextInt();
        y1 = entrada.nextInt();
        System.out.print("Digite o ponto p2(x2,y2): ");
        x2 = entrada.nextInt();
        y2 = entrada.nextInt();

        if (x1 > x2) {
            System.out.print("P2 está a esquerda e ");
            if (y1 > y2) {
                System.out.print("abaixo de ");
            } else {
                System.out.print("acima de ");
            }
            System.out.println("P2");
        } else {
            System.out.print("P2 está a direita e ");
            if (y1 > y2) {
                System.out.print("abaixo de ");
            } else {
                System.out.print("acima de ");
            }
            System.out.println("P1");
        }

    }
}
