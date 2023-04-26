// Construa um programa que conte a quantidades de letras de uma palavra.
// Exemplo: “casa” Resultado: c=1 a =2 s =1

import java.util.Scanner;

public class Questao33 { 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = inputObj.nextLine();

        int[] contador = new int[26];

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                contador[letra - 'a']++;
            }
        }

        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0) {
                char letra = (char) ('a' + i);
                System.out.printf("%c=%d ", letra, contador[i]);
            }
        }
    }
}