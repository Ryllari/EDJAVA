// Receba do teclado dois números inteiros, calcule e exiba os resultados das seguintes operações: 
// adição, subtração, multiplicação, quociente da divisão e o resto da divisão.

import java.util.Scanner;

public class Questao03{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite sua o primeiro valor: ");
        int valorA = inputObj.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valorB = inputObj.nextInt();

        System.out.println("[SOMA] " + valorA + " + " + valorB + " = " + Questao03.soma(valorA, valorB));
        System.out.println("[SUBTRACAO] " + valorA + " - " + valorB + " = " + Questao03.subtracao(valorA, valorB));
        System.out.println("[MULTIPLICACAO] " + valorA + " x " + valorB + " = " + Questao03.multiplica(valorA, valorB));
        System.out.println(
            "[DIVISAO] " + 
            valorA + " / " + valorB + " = " + 
            Questao03.quociente(valorA, valorB) +
            ", com resto " +
            Questao03.resto(valorA, valorB) 
        );
    }

    private static int soma(int valorA, int valorB){
        int valorSoma = valorA + valorB;
        return(valorSoma);
    }

    private static int subtracao(int valorA, int valorB){
        int valorSub = valorA - valorB;
        return(valorSub);
    }

    private static int multiplica(int valorA, int valorB){
        int valorMulti = valorA * valorB;
        return(valorMulti);
    }


    private static int quociente(int valorA, int valorB){
        int valorQuo = valorA / valorB;
        return(valorQuo);
    }

    private static int resto(int valorA, int valorB){
        int valorQuo = valorA % valorB;
        return(valorQuo);
    }

}