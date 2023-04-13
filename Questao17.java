// Construa um programa que leia do usuário um número inicial e um número final. 
// Em seguida, exiba na tela uma sequencia apenas com os números ímpares dentro deste intervalo informado pelo usuário. 
//Exemplo: caso o usuário entre com os números 4 e 10, o resultado seria: 5 7 9
// a) Construa este programa utilizando a estrutura while.
// b) Construa este programa utilizando a estrutura do-while.
// c) Construa este programa utilizando a estrutura for.

import java.util.Scanner;

public class Questao17{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite o número inicial: ");
        int inicio = inputObj.nextInt();

        System.out.println("Digite o número final: ");
        int fim = inputObj.nextInt();

        Questao17.useWhile(inicio, fim);
        Questao17.useDoWhile(inicio, fim);
        Questao17.useFor(inicio, fim);
        
    }

    private static void useWhile(int inicio, int fim){
        System.out.println("Sequencia usando while: ");
        int atual = inicio;

        while (atual <= fim) {
            if (atual % 2 != 0) {
                System.out.print(atual + " ");
            }
            atual++;
        }
        System.out.println("");
    }

    private static void useDoWhile(int inicio, int fim){
        System.out.println("Sequencia usando do-while: ");
        int atual = inicio;

        do {
            if (atual % 2 != 0) {
                System.out.print(atual + " ");
            }
            atual++;
        } while (atual <= fim);
        System.out.println("");
    }
    
    private static void useFor(int inicio, int fim){
        System.out.println("Sequencia usando for: ");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}