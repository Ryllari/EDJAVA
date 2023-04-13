// Calcular o IMC (índice de massa corporal) de uma pessoa. Produza um alerta em caso de divisão por zero

import java.util.Scanner;

public class Questao08{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite o valor do seu peso (kg): ");
        double valorA = inputObj.nextDouble();

        System.out.println("Digite o valor da sua altura (m): ");
        double valorB = inputObj.nextDouble();

        if (valorB == 0) {
            System.out.println("Valor digitado inválido, valor deve ser acima de 0!");
        } else {
            System.out.println(
                "O seu IMC é: " +  
                Questao08.imc(valorA, valorB)
            );   
        }
    }

    private static double imc(double valorPeso, double valorAltura){
        double valorQuo = valorPeso / Math.pow(valorAltura, 2);
        return(valorQuo);
    }

}