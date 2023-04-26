// Construa e use uma função que produz um novo vetor de inteiros 
// com a ordem inversa do vetor original passado por parâmetro.

import java.util.Scanner;

public class Questao27{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = inputObj.nextInt();

        int[] vetor = getVetor(tamanhoVetor, inputObj);

        System.out.println("Vetor original:");
        printVetor(vetor);

        int[] invertido = inverteVetor(vetor);
        System.out.println("\nVetor invertido:");
        printVetor(invertido);
        
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

    public static int[] inverteVetor(int[] vetor) {
        int tamanho = vetor.length;
        int[] invertido = new int[tamanho];
    
        for (int i = 0; i < tamanho; i++) {
            invertido[i] = vetor[tamanho - 1 - i];
        }
    
        return(invertido);
    }
}