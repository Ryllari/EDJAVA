// Construa um programa que calcule uma equação do 2º grau.
// Crie uma função com retorno para calcular o delta.
// Crie uma função sem retorno para calcular as raízes.


import java.util.Scanner;

public class Questao14{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente de x² (a): ");
        double a = inputObj.nextDouble();
        if (a == 0){
            System.out.println("A equacao nao pode ser solucionada com o valor do coeficiente de x² (a) = 0");
            return;
        }

        System.out.println("Digite o valor do coeficiaente de x (b): ");
        double b = inputObj.nextDouble();

        System.out.println("Digite o valor da constante (c): ");
        double c = inputObj.nextDouble();

        System.out.println("Vamos calcular a equaçao (" + a + ")x² + (" +b +")x + (" + c +") = ?");

        System.out.println("x' = " + Questao14.x1(a, b, c));
        System.out.println("x'' = " + Questao14.x2(a, b, c));

        
    }

    private static double getDelta(double a, double b, double c){
        return (Math.pow(b, 2) - (4*a*c));
    }

    private static double x1(double a, double b, double c){
        if (b == 0) {
            return (Math.sqrt((-1 * c / a)));
        }
        if (c == 0) {
            return (0);
        }

        double delta = Questao14.getDelta(a, b, c);
        return ((-1*b + Math.sqrt(delta)) / 2*a);
    }

    private static double x2(double a, double b, double c){
        if (b == 0) {
            return (-1 * Math.sqrt((-1 * c / a)));
        }
        if (c == 0) {
            return (-1 * b / a);
        }

        double delta = Questao14.getDelta(a, b, c);
        return ((-1*b - Math.sqrt(delta)) / 2*a);
    }
}