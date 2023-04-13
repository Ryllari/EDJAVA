// Construa um programa que calcule o rendimento mensal de um investimento em poupança. 
// Variáveis: investimento inicial, investimento mensal, quantidade de meses, saldo acumulado, 
// taxa de juros mensal, rendimento mensal.

import java.util.Scanner;

public class Questao20{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite o investimento inicial: ");
        double investimentoInicial = inputObj.nextDouble();

        System.out.print("Digite o investimento mensal: ");
        double investimentoMensal = inputObj.nextDouble();

        System.out.print("Digite a quantidade de meses: ");
        int quantidadeMeses = inputObj.nextInt();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJurosMensal = inputObj.nextDouble();

        double saldoAcumulado = getSaldoAcumulado(investimentoInicial, investimentoMensal, quantidadeMeses, taxaJurosMensal);
        System.out.printf("Mês %d - Saldo acumulado: R$%.2f\n", quantidadeMeses, saldoAcumulado);

    }

    private static double getSaldoAcumulado(double investimentoInicial, double investimentoMensal, int quantidadeMeses, double taxaJurosMensal){
        double saldoAcumulado = investimentoInicial;
        for (int i = 1; i <= quantidadeMeses; i++) {
            double rendimentoMensal = (saldoAcumulado + investimentoMensal) * (taxaJurosMensal / 100.0);
            saldoAcumulado += investimentoMensal + rendimentoMensal;
        }
        return (saldoAcumulado);
    }
}