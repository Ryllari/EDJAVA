//  Construa um programa que calcule o somatório dos números inteiros de um intervalo,
// definido por um número inicial e um número final.
// Exemplo: caso as entradas fossem 4 e 9, o resultado seria: 39

import java.util.Scanner;

public class Questao22{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int numInicial = inputObj.nextInt();
        
        System.out.print("Digite o número final do intervalo: ");
        int numFinal = inputObj.nextInt();
        
        int somatorio = getSomatorio(numInicial, numFinal);
        System.out.println("O somatório dos números no intervalo informado é: " + somatorio);
    }

    private static int getSomatorio(int numInicial, int numFinal){
        int somatorio = 0;
        
        for (int i = numInicial; i <= numFinal; i++) {
            somatorio += i;
        }
        return(somatorio);
    }
}