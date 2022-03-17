package POO_atividade;

import java.util.Scanner;

/* X minutos em dias, horas e minutos
    1 dia = 1440 minutos
    1 hora = 60 minutos
*/
public class q6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int minutos;
        System.out.print("Digite uma quantidade X de minutos:");
        minutos = entrada.nextInt();

        int dias = minutos / 1440;
        int restominutos = 0;
        if (minutos % 1440 != 0) {
            restominutos = minutos - 1440 * dias;
        }
        int horas = restominutos / 60;
        int minutosFinais = 0;
        if (restominutos % 60 != 0) {
            minutosFinais = restominutos - 60 * horas;
        }
        System.out.print("\n"+minutos+ " minutos = "+dias+" dias, ");
        System.out.print(horas+" horas e ");
        System.out.println(minutosFinais+" minutos");
    }
}
