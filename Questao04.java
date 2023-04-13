// Calcular e exibir a média aritmética de três números inteiros.

import java.util.Scanner;

public class Questao04{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite sua o primeiro valor: ");
        int valorA = inputObj.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valorB = inputObj.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valorC = inputObj.nextInt();

        System.out.println(
            "A média entre os valores " + 
            valorA + ", " + valorB + " e " + valorC + " é: " +
            Questao04.media(valorA, valorB, valorC)
        );
        
    }

    private static int media(int valorA, int valorB, int valorC){
        int valorSoma = valorA + valorB + valorC;
        return(valorSoma / 3);
    }
}