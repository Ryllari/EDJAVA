// Distinguir, com base na média parcial do aluno, se ele está aprovado, reprovado ou na final. 
// Aplique as regras da UFERSA.
// Até 3.5: Reprovado | De 3.5 a 7: Prova Final | 7+: Aprovado

import java.util.Scanner;

public class Questao12{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = inputObj.nextDouble();

        if (nota < 3.5){
            System.out.println("Status: REPROVADO");
        } else if (3.5 <= nota && nota < 7) {
            System.out.println("Status: PROVA FINAL");
        } else {
            System.out.println("Status: APROVADO");
        }
    }
}