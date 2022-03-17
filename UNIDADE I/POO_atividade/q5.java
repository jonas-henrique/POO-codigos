package POO_atividade;
import java.util.Scanner;
import javax.print.event.PrintEvent;
/* 
CUD -> UCD
Exemplo: 123 -> 312

se dividir 123/10 dar 12.3(float), ou seja ja tem o 12 e pra achar o 3 pega o resto dessa divisão
que é 0.3 = 3

ai temos 12.3 e o 3, e transforma esses dois numeros em um só, onde só pega o inteiro do 12.3 = 12
UCD = 321
*/
public class q5 {
    public static void main(String[] args) {
        int cdu =0;  
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Digite um número de 3 dígitos CDU: ");
            cdu = entrada.nextInt();  
            if((cdu/10) <10){
                System.out.println("Esse número não tem 3 digitos, digite novamente\n");
            }
        }while((cdu/10) <10);

        float div = cdu/10;
        int resto = cdu%10;
        int ucd = Integer.parseInt(resto+""+(int)div);
        System.out.println("\nResultado UCD: "+ucd);
    }
}
