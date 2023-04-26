// Construa um programa que identifique o maior e o menor número de um vetor de inteiros.

import java.util.Scanner;

public class Questao28{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = inputObj.nextInt();

        int[] vetor = getVetor(tamanhoVetor, inputObj);

        System.out.println("Vetor original:");
        printVetor(vetor);

        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < tamanhoVetor; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.printf("Maior valor: %d\n", maior);
        System.out.printf("Menor valor: %d\n", menor);        
    }

    public static void printVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static int[] getVetor(int tamanhoVetor, Scanner inputObj) {
        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("Digite o valor da posição %d: ", i);
            vetor[i] = inputObj.nextInt();
        }
        return(vetor);
    }
}