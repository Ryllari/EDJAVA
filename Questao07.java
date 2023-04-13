// Calcular uma divisão entre dois números reais. Produza um alerta em caso de divisão por zero

import java.util.Scanner;

public class Questao07{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite sua o primeiro valor: ");
        double valorA = inputObj.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valorB = inputObj.nextDouble();

        if (valorB == 0) {
            System.out.println("Valor digitado inválido, nao é possível dividir um valor por 0!");
        } else {
            System.out.println(
                "[DIVISAO] " + 
                valorA + " / " + valorB + " = " + 
                Questao07.divisao(valorA, valorB)
            );   
        }

        
    }

    private static double divisao(double valorA, double valorB){
        double valorQuo = valorA / valorB;
        return(valorQuo);
    }

}