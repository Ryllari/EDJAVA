// Calcule o somatório dos números inteiros do intervalo entre dois números.
// No mesmo programa, implemente esse cálculo em duas funções:
// a) Resolva o problema com estrutura de repetição.
// b) Resolva o problema com recursividade.
// c) Analise os pontos positivos e negativos de cada versão.

import java.util.Scanner;

public class Questao37{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int numInicial = inputObj.nextInt();
        
        System.out.print("Digite o número final do intervalo: ");
        int numFinal = inputObj.nextInt();

        int somatorioRepete = somatorioRepeticao(numInicial, numFinal);
        System.out.println("###### USANDO REPETIÇAO ######");
        System.out.println("O somatório dos números no intervalo informado usando repetiçao é: " + somatorioRepete);
        System.out.println("Pontos Positivos:");
        System.out.println("- Simples e fácil de entender \n- Não consume muita memória");
        System.out.println("Ponto Negativo:");
        System.out.println("- Pode ser mais lenta para somar números muito grandes");


        int somatorioRecursivo = somatorioRecursividade(numInicial, numFinal);
        System.out.println("\n\n###### USANDO RECURSIVIDADE ######");        
        System.out.println("O somatório dos números no intervalo informado usando recursividade é: " + somatorioRecursivo);
        System.out.println("Pontos Positivos:");
        System.out.println("- Elegante e concisa \n- Grande desempenho para somar números pequenos");
        System.out.println("Pontos Negativos:");
        System.out.println("- Pode consumir muita memória para somar números muito grandes \n- A escrita do algoritmo pode ser um pouco mais difícil de entender");

    }

    // a
    private static int somatorioRepeticao(int limiteInferior, int limiteSuperior) {
        int soma = 0;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            soma += i;
        }
        return soma;
    }

    // b
    private static int somatorioRecursividade(int limiteInferior, int limiteSuperior) {
        if (limiteInferior == limiteSuperior) {
            return limiteInferior;
        } else {
            return limiteInferior + somatorioRecursividade(limiteInferior + 1, limiteSuperior);
        }
    }
}