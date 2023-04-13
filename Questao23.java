//  Construa um programa que calcule o fatorial de um número. 
// Use uma estrutura de repetição. Fatorial: n! = n (n − 1)!
// Exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120 ou 5! = 1 x 2 x 3 x 4 x 5 = 120

import java.util.Scanner;

public class Questao23{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = inputObj.nextInt();

        sendFatorial(numero);
    }

    private static void sendFatorial(int numero){
        int fatorial = numero;

        System.out.printf("%d! = %d ", numero, fatorial);
        for (int i = numero-1; i >= 1; i--) {
            fatorial *= i;
            System.out.printf("x %d ", i); 
        }

        System.out.printf("= %d \n", fatorial);
    }
}