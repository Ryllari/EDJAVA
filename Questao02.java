// Atribua com valores vindos do teclado variáveis adequadas para: sua idade, sua altura, primeira letra do seu nome, seu nome completo.
// Depois exiba os dados na tela.

import java.util.Scanner;

public class Questao02{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = inputObj.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = inputObj.nextDouble();

        System.out.println("Digite a primeira letra do seu nome: ");
        String primeiraLetra = inputObj.next();

        System.out.println("Digite o seu nome completo: ");
        String nome = inputObj.next();

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Primeira letra do seu nome: " + primeiraLetra);
        System.out.println("Nome completo: " + nome);
    }
}