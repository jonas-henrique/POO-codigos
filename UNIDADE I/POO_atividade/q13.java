package POO_atividade;

/*
Escreva um programa que determine quais são todos os números de 3 algarismos cuja soma
dos cubos de seus algarismos sejam iguais ao próprio número. 
Exemplo: 153 = 13 + 53 + 33 = 1 + 125 + 27.
OBS: Menor n de 3 algarismos = 100 e o maior = 999
 */
public class q13 {
    public static void main(String[] args) {
        float primeiro, terceiro;
        float segundo;
        int soma_cubos;
        System.out.println("Números de 3 algarismos:");
        for (int i = 100; i <= 999; i++) {
            primeiro = (int) i / 100;
            segundo = (int) (((float) ((int) i / 10) / 10 - (int) i / 100) * 10);
            terceiro = (int) (((float) i / 10 - (int) i / 10) * 10);
            soma_cubos = (int) (Math.pow(primeiro, 3) + Math.pow(segundo, 3) + Math.pow(terceiro, 3));
            if (soma_cubos == i) {
                System.out.println(i);
            }

        }
    }
}
