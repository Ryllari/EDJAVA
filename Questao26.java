// Construa um programa pra ler e exibir uma matriz de inteiros. 
// Em tempo de execução, o usuário pode definir o tamanho da matriz.

import java.util.Scanner;

public class Questao26{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = inputObj.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = inputObj.nextInt();

        int matriz[][] = getMatriz(linhas, colunas, inputObj);
        printMatriz(matriz, linhas, colunas);
        
    }

    public static void printMatriz(int[][] matriz, int linhas, int colunas) {
        System.out.println("Matriz digitada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static int[][] getMatriz(int linhas, int colunas, Scanner inputObj) {
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor da posição (%d,%d): ", i, j);
                matriz[i][j] = inputObj.nextInt();
            }
        }
        return(matriz);
    }
}