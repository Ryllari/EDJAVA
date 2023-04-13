// Construa um programa pra ler e exibir um vetor de inteiros.
// Em tempo de execução, o usuário pode definir o tamanho do vetor.

import java.util.Scanner;

public class Questao25{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = inputObj.nextInt();

        int[] vetor = getVetor(tamanhoVetor, inputObj);
        printVetor(vetor, tamanhoVetor);
        
    }

    public static void printVetor(int[] vetor, int tamanhoVetor) {
        System.out.println("Vetor digitado:");
        for (int i = 0; i < tamanhoVetor; i++) {
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

    public static void fatorial(Scanner inputObj) {
        System.out.print("Digite o número: ");
        int numeroFatorial = inputObj.nextInt();
        int fatorial = numeroFatorial;
        System.out.printf("%d! = %d ", numeroFatorial, fatorial);
        for (int i = numeroFatorial-1; i >= 1; i--) {
            fatorial *= i;
            System.out.printf("x %d ", i); 
        }
        System.out.printf("= %d \n", fatorial); 
    }

}