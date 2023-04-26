// Utilizando o recurso Generic de Java, faça um método para exibir um objeto (usando seu método toString), 
// e outro método para exibir os elementos de um vetor.

public class Questao38 {

    public static <T> void exibirObjeto(T objeto) {
        System.out.println(objeto.toString());
    }

    public static <T> void exibirVetor(T[] vetor) {
        for (T elemento : vetor) {
            System.out.print(elemento.toString());
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Exemplo de uso do método exibirObjeto
        String mensagem = "Olá, mundo!";
        exibirObjeto(mensagem);

        // Exemplo de uso do método exibirVetor
        Integer[] numeros = { 1, 2, 3, 4, 5 };
        exibirVetor(numeros);
    }
}
