package POO_atividade;

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
