// Construa um programa que inverta a frase digitada pelo usuário. 
// Por exemplo, se string1 for “bom dia”, então string2 será “aid mob”.

import java.util.Scanner;

public class Questao30 { 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = inputObj.nextLine();
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida.append(frase.charAt(i));
        }

        System.out.println("Frase invertida: " + fraseInvertida);
    }
}