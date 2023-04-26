// Construa e use uma função para calcular o fatorial de um número utilizando recursividade.

import java.util.Scanner;

public class Questao36{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = inputObj.nextInt();

        System.out.printf("%d! = %d ", numero, fatorial(numero));
    }

    private static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}