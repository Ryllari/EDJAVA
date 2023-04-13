// Construa um programa que calcule a área de um círculo, tendo como entrada o valor do raio, que deve ser positivo. 
// Use o valor da constante PI vindo da biblioteca matemática.

import java.util.Scanner;

public class Questao09{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double valorRaio = inputObj.nextDouble();

        if (valorRaio <= 0) {
            System.out.println("Valor digitado inválido, valor deve ser positivo!");
        } else {
            System.out.println(
                "O valor da área do círculo é: " +  
                Questao09.areaCirculo(valorRaio)
            );   
        }
    }

    private static double areaCirculo(double valorRaio){
        return(Math.PI * Math.pow(valorRaio, 2));
    }

}