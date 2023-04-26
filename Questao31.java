// Construa um programa que registre objetos da classe Pessoa, 
// com os seguintes atributos: cpf, nome, idade, sexo, peso, altura, imc. 
// Permita que o usuário defina a quantidade de pessoas em tempo de execução. 
// Ao cadastrar uma pessoa, calcule o IMC (Índice de Massa Corporal). 
// Ao final, exiba a lista de pessoas (com seus respectivos atributos).

import java.util.Scanner;

public class Questao31 { 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        
        System.out.print("Digite o número de pessoas: ");
        int numPessoas = inputObj.nextInt();
        inputObj.nextLine(); // Consumir o \n do buffer

        Pessoa[] pessoas = new Pessoa[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Cadastro da pessoa " + (i+1) + ":");
            System.out.print("CPF: ");
            String cpf = inputObj.nextLine();

            System.out.print("Nome: ");
            String nome = inputObj.nextLine();

            System.out.print("Idade: ");
            int idade = inputObj.nextInt();
            inputObj.nextLine(); // Consumir o \n do buffer

            System.out.print("Sexo: ");
            String sexo = inputObj.nextLine();

            System.out.print("Peso: ");
            double peso = inputObj.nextDouble();

            System.out.print("Altura: ");
            double altura = inputObj.nextDouble();
            inputObj.nextLine(); // Consumir o \n do buffer

            pessoas[i] = new Pessoa(cpf, nome, idade, sexo, peso, altura);
            System.out.println("Cadastro da pessoa " + (i+1) + " realizado com sucesso!\n");
        }

        System.out.println("Lista de pessoas cadastradas:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}