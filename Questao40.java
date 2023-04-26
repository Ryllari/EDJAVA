// Construa um programa CODIFICADOR que receba um arquivo de texto de entrada 
// e codifique ele usando um padrão de troca de letras.
// Após esse processamento, gere um arquivo codificado.
// Construa outro programa, que funcionará como DECODIFICADOR, 
// que seja capaz de ler o arquivo codificado e produzir um arquivo de texto decodificado, 
// que deve ser o mesmo texto original.
// Padrão de troca de letras para codificar um texto: 
// Z ⇔ P       E ⇔ O        N ⇔ L       I ⇔ A       T ⇔ R

import java.util.*;
import java.io.*;

public class Questao40{
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Codificar arquivo");
            System.out.println("2 - Decodificar arquivo");
            System.out.println("0 - Sair");

            opcao = inputObj.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do arquivo a ser codificado:");
                    String nomeArquivoEntrada = inputObj.next();
                    System.out.println("Digite o nome do arquivo onde deseja salvar o texto codificado:");
                    String nomeArquivoSaida = inputObj.next();
                    codificarArquivo(nomeArquivoEntrada, nomeArquivoSaida);
                    break;
                case 2:
                    System.out.println("Digite o nome do arquivo a ser decodificado:");
                    String nomeArquivoEntradaD = inputObj.next();
                    System.out.println("Digite o nome do arquivo onde deseja salvar o texto limpo:");
                    String nomeArquivoSaidaD = inputObj.next();
                    decodificarArquivo(nomeArquivoEntradaD, nomeArquivoSaidaD);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void codificarArquivo(String nomeArquivoEntrada, String nomeArquivoSaida) {
        try {
            File arquivoEntrada = new File(nomeArquivoEntrada);
            FileReader leitorArquivo = new FileReader(arquivoEntrada);
            BufferedReader leitorBuffer = new BufferedReader(leitorArquivo);
            File arquivoSaida = new File(nomeArquivoSaida);
            FileWriter escritorArquivo = new FileWriter(arquivoSaida);
            BufferedWriter escritorBuffer = new BufferedWriter(escritorArquivo);
            String linha;
            while ((linha = leitorBuffer.readLine()) != null) {
                linha = linha.replace('Z', '\0').replace('P', 'Z').replace('\0', 'P')
                        .replace('E', '\0').replace('O', 'E').replace('\0', 'O')
                        .replace('N', '\0').replace('L', 'N').replace('\0', 'L')
                        .replace('I', '\0').replace('A', 'I').replace('\0', 'A')
                        .replace('T', '\0').replace('R', 'T').replace('\0', 'R');
                escritorBuffer.write(linha);
                escritorBuffer.newLine();
            }
            leitorBuffer.close();
            escritorBuffer.close();
            System.out.println("Arquivo codificado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao codificar o arquivo.");
            e.printStackTrace();
        }
    }

    public static void decodificarArquivo(String nomeArquivoEntrada, String nomeArquivoSaida) {
        try {
            File arquivoEntrada = new File(nomeArquivoEntrada);
            FileReader leitorArquivo = new FileReader(arquivoEntrada);
            BufferedReader leitorBuffer = new BufferedReader(leitorArquivo);
            File arquivoSaida = new File(nomeArquivoSaida);
            FileWriter escritorArquivo = new FileWriter(arquivoSaida);
            BufferedWriter escritorBuffer = new BufferedWriter(escritorArquivo);
            String linha;
            while ((linha = leitorBuffer.readLine()) != null) {
                linha = linha.replace('P', '\0').replace('Z', 'P').replace('\0', 'Z')
                        .replace('O', '\0').replace('E', 'O').replace('\0', 'E')
                        .replace('L', '\0').replace('N', 'L').replace('\0', 'N')
                        .replace('A', '\0').replace('I', 'A').replace('\0', 'I')
                        .replace('R', '\0').replace('T', 'R').replace('\0', 'T');
                escritorBuffer.write(linha);
                escritorBuffer.newLine();
            }
            leitorBuffer.close();
            escritorBuffer.close();
            System.out.println("Arquivo decodificado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao decodificar o arquivo.");
            e.printStackTrace();
        }
    }
}