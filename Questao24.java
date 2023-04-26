// Construa um programa que simule uma calculadora. 
// Disponibilize um menu de opções e simule a opção desejada, 
// exibindo novamente o menu, até que o usuário escolha sair. 
// Menu de opções:
// 1 - potenciação  # Dica: utilize a função da biblioteca matemática.
// 2 - raiz quadrada # Dica: utilize a função da biblioteca matemática.
// 3 - fatorial # Dica: crie e utilize uma função com a solução da questão anterior.
// 0 - sair

import java.util.Scanner;

public class Questao24{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Potenciação");
            System.out.println("2 - Raiz Quadrada");
            System.out.println("3 - Fatorial");
            System.out.println("0 - Sair");

            opcao = inputObj.nextInt();

            switch (opcao) {
                case 1:
                    potencia(inputObj);
                    break;
                case 2:
                    raiz(inputObj);
                    break;
                case 3:
                    fatorial(inputObj);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void potencia(Scanner inputObj) {
        System.out.print("Digite a base: ");
        double base = inputObj.nextDouble();
        System.out.print("Digite o expoente: ");
        double expoente = inputObj.nextDouble();
        double resultadoPotencia = Math.pow(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultadoPotencia);
    }

    public static void raiz(Scanner inputObj) {
        System.out.print("Digite o número: ");
        double numero = inputObj.nextDouble();
        double resultadoRaiz = Math.sqrt(numero);
        System.out.println("A raiz quadrada de " + numero + " é " + resultadoRaiz);
    }

    public static void fatorial(Scanner inputObj) {
        System.out.print("Digite o número: ");
        int numeroFatorial = inputObj.nextInt();
        int fatorial = numeroFatorial;
        System.out.printf("%d! = %d ", numeroFatorial, fatorial);
        for (int i = numeroFatorial-1; i >= 1; i--) {
            fatorial *= i;
            System.out.printf("x %d ", i); 
        }
        System.out.printf("= %d \n", fatorial); 
    }

}