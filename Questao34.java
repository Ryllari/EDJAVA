// Construa um programa que conte a quantidades de vezes que as palavras de uma frase aparecem.
// Exemplo: “estude muito sempre sempre estude” Resultado: estude=2 muito=1 sempre=2

import java.util.HashMap;
import java.util.Scanner;

public class Questao34 { 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = inputObj.nextLine();
        
        String[] palavras = frase.split(" ");
        HashMap<String, Integer> frequencias = new HashMap<String, Integer>();
        
        for (String palavra : palavras) {
            if (frequencias.containsKey(palavra)) {
                int frequencia = frequencias.get(palavra);
                frequencias.put(palavra, frequencia + 1);
            } else {
                frequencias.put(palavra, 1);
            }
        }
        
        System.out.println("Frequência de palavras:");
        for (String palavra : frequencias.keySet()) {
            int frequencia = frequencias.get(palavra);
            System.out.printf("%s=%d ", palavra, frequencia);
        }
    }
}