// Construa um programa que leia um número inteiro digitado pelo usuário. 
// Caso o número pertença ao intervalo de 1 a 5, exiba o número por extenso. 
// Caso o número não pertença a este intervalo, exiba a mensagem "valor invalido".


import java.util.Scanner;

public class Questao15{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = inputObj.nextInt();

        if (numero == 1) {
            System.out.println("um");
        } else if (numero == 2) {
            System.out.println("dois");
        } else if (numero == 3) {
            System.out.println("três");
        } else if (numero == 4) {
            System.out.println("quatro");
        } else if (numero == 5) {
            System.out.println("cinco");
        } else {
            System.out.println("Valor inválido");
        } 
    }
}