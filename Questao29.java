// Construa um programa que mova o número da última posição de um vetor para a primeira posição. 
// Faça isso gradativamente: use uma estrutura de repetição, e em cada iteração do loop 
// mova esse número apenas uma posição,
// ou seja, troque esse número da posição n por n-1.

import java.util.Scanner;

public class Questao29{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = inputObj.nextInt();

        int[] vetor = getVetor(tamanhoVetor, inputObj);

        System.out.println("Vetor original:");
        printVetor(vetor);

        vetor = moverUltimoParaPrimeiraPosicao(vetor);

        System.out.print("Vetor modificado: ");
        printVetor(vetor);
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

    public static int[] moverUltimoParaPrimeiraPosicao(int[] vetor) {
        int ultimo = vetor[vetor.length - 1];
        for (int i = vetor.length - 1; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = ultimo;

        return(vetor);
    }
}