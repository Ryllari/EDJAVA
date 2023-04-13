// Construa um programa que leia um número inteiro e identifique se ele é par ou ímpar.

import java.util.Scanner;

public class Questao10{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite o um número inteiro: ");
        int valorA = inputObj.nextInt();

        if (Questao10.isPar(valorA)){
            System.out.println("Valor digitado é par!");
        } else {
            System.out.println("Valor digitado é ímpar!");
        }
        
    }

    private static boolean isPar(int valorA){
        return (valorA % 2 == 0);
    }

}