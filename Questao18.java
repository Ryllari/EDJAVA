// Verificar se a senha, informada durante a execução, é correta. 
// Quando a senha estiver correta, exiba “senha correta” e o programa é encerrado.
// Quando a senha estiver errada, exiba “senha incorreta”, e permita a entrada novamente da senha,
// repetindo esse processo até que a senha entrada seja correta.
// a) Resolva esse problema utilizando a estrutura while.
// b) Resolva esse problema utilizando a estrutura do-while.

import java.util.Scanner;

public class Questao18{ 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        String senha = "senha123";

        useWhile(senha, inputObj);
        useDoWhile(senha, inputObj);
        
    }

    private static void useWhile(String senha, Scanner inputObj){
        System.out.println("################\nVerificar usando while: ");
        boolean senhaIncorreta = true;

        while (senhaIncorreta) {
            System.out.println("Digite a senha: ");
            String entrada = inputObj.nextLine();

            if (entrada.equals(senha)) {
                System.out.println("Senha correta.");
                senhaIncorreta = false;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
    }

    private static void useDoWhile(String senha, Scanner inputObj){
        System.out.println("################\nVerificar usando do-while: ");
        boolean senhaIncorreta;

        do {
            System.out.println("Digite a senha: ");
            String entrada = inputObj.nextLine();

            if (entrada.equals(senha)) {
                System.out.println("Senha correta.");
                senhaIncorreta = false;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
                senhaIncorreta = true;
            }
        } while (senhaIncorreta);
    }
}