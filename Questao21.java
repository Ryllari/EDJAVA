// Construa um programa que identifique se um número é primo.

import java.util.Scanner;

public class Questao21{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = inputObj.nextInt();

        boolean ehPrimo = verificaPrimo(numero);


        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

    }

    private static boolean verificaPrimo(int numero){
        boolean primo = true;
        if (numero < 2) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        return(primo);
    }
}