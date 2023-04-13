// Construa um programa para exibir a tabuada de qualquer número “n” (1 a 9), 
// sendo “n” um número fornecido pelo usuário. 
// Utilize estrutura de repetição.

import java.util.Scanner;

public class Questao19{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 9: ");
        int num = inputObj.nextInt();

        while (num < 1 || num > 9) {
            System.out.print("Número inválido. Digite um número de 1 a 9: ");
            num = inputObj.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
    }
}