package POO_atividade;

import java.util.Scanner;

/*
    Celsius -> Fah
    Formula
    celsiul*1.8 + 32 = Fah
*/
public class q4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double celsius, fah;
        System.out.print("Digite um valor para graus °C: ");
        celsius = entrada.nextDouble();

        fah = (celsius*1.8)+32;

        System.out.println(celsius+"°C foi transformado em: "+fah+"°F Fahrenheit");
        
    }
    
}
