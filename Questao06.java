// Construa um programa que gerencia a conta de uma pizzaria.
// Preço do refrigerante: R$ 1,50. Preço da fatia de pizza: R$ 3,00. Taxa do garçom: 10%.
// Receba do usuário: a quantidade de refrigerantes, a quantidade de fatias e a quantidade de pessoas na mesa.
// Calcule e exiba: o total sem a taxa, o total com a taxa, o rateio por pessoa com a taxa

import java.util.Scanner;

public class Questao06{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite a quantidade de refrigerantes consumidos: ");
        int totalRefri = inputObj.nextInt();


        System.out.println("Digite a quantidade de pizzas consumidas: ");
        int totalPizza = inputObj.nextInt();

        System.out.println("Digite a quantidade de pessoas na mesa: ");
        int nPessoa = inputObj.nextInt();

        System.out.println(
            "Total da conta: " + 
            Questao06.total(totalRefri, totalPizza)
        );

        System.out.println(
            "Total da conta com taxa: " + 
            Questao06.totalTaxa(totalRefri, totalPizza)
        );

        System.out.println(
            "Valor da conta por pessoa: " + 
            Questao06.totalRateio(totalRefri, totalPizza, nPessoa)
        );
        
    }

    private static double total(int totalRefri, int totalPizza){
        double valorRefri = 1.5;
        double valorPizza = 3.0;

        double custoRefri = totalRefri * valorRefri;
        double custoPizza = totalPizza * valorPizza;
        return(custoPizza + custoRefri);
    }

    private static double totalTaxa(int totalRefri, int totalPizza){
        double valorTotal = Questao06.total(totalRefri, totalPizza);
        return(valorTotal * 1.1);
    }

    private static double totalRateio(int totalRefri, int totalPizza, int nPessoa){
        double valorTotalTaxa = Questao06.totalTaxa(totalRefri, totalPizza);
        return(valorTotalTaxa / nPessoa);
    }
}