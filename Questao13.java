// Construa um programa que calcule para o aluno sua média parcial 
// e informe sua situação parcial (Aprovado, Recuperação ou Reprovado).
// Caso ele esteja em Recuperação, calcule quanto ele precisa tirar na 4ª prova para ser aprovado 
// (média final maior ou igual que 5,0).
// Observação: utilize os pesos e regras da UFERSA.
// 𝑀𝑃 = (𝐴1 +𝐴2 + 𝐴3)⁄3
// 𝑀𝐹 = (𝑀𝑃 × 6+ 𝐴𝐹 × 4)⁄10


import java.util.Scanner;

public class Questao13{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite a nota da unidade 1: ");
        double nota1 = inputObj.nextDouble();

        System.out.println("Digite a nota da unidade 2: ");
        double nota2 = inputObj.nextDouble();

        System.out.println("Digite a nota da unidade 3: ");
        double nota3 = inputObj.nextDouble();

        double mP = Questao13.mediaParcial(nota1, nota2, nota3);

        if (mP < 3.5){
            System.out.println("Status: REPROVADO");
        } else if (3.5 <= mP && mP < 7) {
            System.out.println("Status: PROVA FINAL");
            double NotaAF = Questao13.minNotaAF(mP);
            System.out.println("Nota necessária para aprovacao: " + NotaAF);
        } else {
            System.out.println("Status: APROVADO");
        }
    }

    private static double mediaParcial(double nota1, double nota2, double nota3){
        return ((nota1 + nota2 + nota3) / 3);
    }

    private static double minNotaAF(double mP){
        return ((50 - 6 * mP) / 4);
    }
}