package POO_atividade;
/*
Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. 
A cidade A tem um crescimento populacional de 3,5% ao ano, enquanto a população 
da cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular 
a quantidade de anos necessária para que a população da cidade A seja maior ou 
igual a população da cidade B.
*/
public class q14 {
    public static void main(String[] args) {
        int pop_a = 7000, pop_b = 20000, qtd_anos = 0;
        double aumentoA, aumentoB;
     
        do {
                aumentoA =pop_a* 3.5 / 100;
                aumentoB = pop_b / 100;
                pop_a = (int)(pop_a + aumentoA);
                pop_b = (int)(pop_b + aumentoB);
                qtd_anos++;
        } while (pop_a < pop_b);
        System.out.println("Quantidade de anos: "+qtd_anos+" anos para A ultrapassar"+
        " B\nPopulação de A = "+pop_a+"\nPopulação de B = "+pop_b);

    }

}
