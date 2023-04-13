// Calcular e exibir a média aritmética de três números reais.

import java.util.Scanner;

public class Questao05{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite sua o primeiro valor: ");
        double valorA = inputObj.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valorB = inputObj.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double valorC = inputObj.nextDouble();

        System.out.println(
            "A média entre os valores " + 
            valorA + ", " + valorB + " e " + valorC + " é: " +
            Questao05.media(valorA, valorB, valorC)
        );
        
    }

    private static double media(double valorA, double valorB, double valorC){
        double valorSoma = valorA + valorB + valorC;
        return(valorSoma / 3);
    }
}