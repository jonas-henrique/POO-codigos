package POO_atividade;
import java.util.Scanner;

public class q12 {
    /* numero perfeito */
    static int perfeito(int n) {
        int cont = 0;
        int max_divisor = n / 2;
        for (int i = 1; i <= max_divisor; i++) {
            if (n % i == 0) {
                cont = i + cont;
            }
        }
        // agr verifica se a soma é igual ao n
        if (cont == n) {
            return 0;
        } else {
            return 1;

        }

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 8128; i++) {
            if (perfeito(i) == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.print("\n");

    }

}
