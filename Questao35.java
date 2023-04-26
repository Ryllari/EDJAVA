// Construa um programa que conte a quantidades de vezes que as palavras de uma frase aparecem.
// Exemplo: “estude muito sempre sempre estude” Resultado: estude=2 muito=1 sempre=2

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Questao35 { 
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

        // Salvar resultado em um arquivo CSV
        try {
            salvarCSV(frequencias);
            System.out.println("\nResultado salvo em 'frequencias.csv'");
        } catch (IOException e) {
            System.out.println("\nErro ao salvar resultado em 'frequencias.csv'");
        }

        // Exibir conteúdo do arquivo CSV
        try {
            String conteudoCSV = lerCSV();
            System.out.println("\nConteúdo do arquivo 'frequencias.csv':");
            System.out.println(conteudoCSV);
        } catch (IOException e) {
            System.out.println("\nErro ao ler arquivo 'frequencias.csv'");
        }
    }

    public static void salvarCSV(HashMap<String, Integer> ocorrencias) throws IOException {
        FileWriter writer = new FileWriter("ocorrencias.csv");

        for (HashMap.Entry<String, Integer> entrada : ocorrencias.entrySet()) {
            writer.append(entrada.getKey());
            writer.append(",");
            writer.append(Integer.toString(entrada.getValue()));
            writer.append("\n");
        }

        writer.flush();
        writer.close();
    }

    public static String lerCSV() throws IOException {
        Scanner scanner = new Scanner(new File("ocorrencias.csv"));
        String conteudo = "";

        while (scanner.hasNextLine()) {
            conteudo += scanner.nextLine() + "\n";
        }

        scanner.close();
        return conteudo;
    }
}