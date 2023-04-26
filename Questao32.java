// Evolua a questão anterior. Permita que o programa salve o resultado em um arquivo binário. 
// Permita que o programa abra o arquivo binário e exiba o conteúdo na tela.

import java.util.Scanner;
import java.io.*;

public class Questao32 { 
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);
        
        System.out.print("Digite o número de pessoas: ");
        int numPessoas = inputObj.nextInt();
        inputObj.nextLine(); // Consumir o \n do buffer

        Pessoa[] pessoas = new Pessoa[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Cadastro da pessoa " + (i+1) + ":");
            System.out.print("CPF: ");
            String cpf = inputObj.nextLine();

            System.out.print("Nome: ");
            String nome = inputObj.nextLine();

            System.out.print("Idade: ");
            int idade = inputObj.nextInt();
            inputObj.nextLine(); // Consumir o \n do buffer

            System.out.print("Sexo: ");
            String sexo = inputObj.nextLine();

            System.out.print("Peso: ");
            double peso = inputObj.nextDouble();

            System.out.print("Altura: ");
            double altura = inputObj.nextDouble();
            inputObj.nextLine(); // Consumir o \n do buffer

            pessoas[i] = new Pessoa(cpf, nome, idade, sexo, peso, altura);
            System.out.println("Cadastro da pessoa " + (i+1) + " realizado com sucesso!\n");
        }

        System.out.println("Digite o nome do arquivo para salvar as pessoas:");
        String nomeArquivo = inputObj.nextLine();

        salvarPessoas(pessoas, nomeArquivo); // salvando os objetos Pessoa no arquivo binário

        System.out.println("\n--- Lista de pessoas cadastradas ---");
        exibirPessoas(nomeArquivo); // exibindo os objetos Pessoa salvos no arquivo binário
    }

    public static void exibirPessoas(String nomeArquivo) {
        try {
            FileInputStream fileIn = new FileInputStream(nomeArquivo);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            while (true) { // lendo os objetos Pessoa até o final do arquivo
                Pessoa pessoa = (Pessoa) objIn.readObject();
                System.out.printf("\nCPF: %s\n", pessoa.getCpf());
                System.out.printf("Nome: %s\n", pessoa.getNome());
                System.out.printf("Idade: %d\n", pessoa.getIdade());
                System.out.printf("Sexo: %c\n", pessoa.getSexo());
                System.out.printf("Peso: %.2f kg\n", pessoa.getPeso());
                System.out.printf("Altura: %.2f m\n", pessoa.getAltura());
                System.out.printf("IMC: %.2f\n", pessoa.getImc());
            }
        } catch (EOFException e) { // EOFException é lançada quando chegamos ao final do arquivo
            System.out.println("\n--- Fim da lista ---");
        } catch (FileNotFoundException e) { 
            System.out.println("\nArquivo nao encontrado");
        } catch (IOException | ClassNotFoundException e) { // tratando possíveis exceções
            e.printStackTrace();
        }

    }

    public static void salvarPessoas(Pessoa[] pessoas, String nomeArquivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(nomeArquivo);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        
            for (Pessoa pessoa : pessoas) {
                objOut.writeObject(pessoa); // escrevendo o objeto Pessoa no arquivo binário
            }

            objOut.close();
            fileOut.close();
            System.out.println("\nPessoas salvas com sucesso no arquivo pessoas.bin.");
        } catch (FileNotFoundException e) { 
            System.out.println("\nArquivo nao encontrado");
        } catch (IOException e) { // tratando possíveis exceções
            e.printStackTrace();
        }
    }
}