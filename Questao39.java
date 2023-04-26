// Utilizando o recurso Generic de Java, construa um programa que tenha funcionalidades de um CRUD 
// (create, read, update e delete). 
// Teste seu programa com as classes Integer e Pessoa (que você mesmo deve criar).

import java.util.*;

public class Questao39{
    public static void main(String[] args) {
        CRUD<Integer> crudInt = new CRUD<>();
        CRUD<Pessoa> crudPessoa = new CRUD<>();
        
        Integer objInt1 = 10;
        Integer objInt2 = 20;
        Pessoa objPessoa1 = new Pessoa("12345678900", "Joao", 30, "M", 75.0, 1.70);
        Pessoa objPessoa2 = new Pessoa("98765432112", "Maria", 25, "F", 60.0, 1.57);
        
        // teste CRUD com Integer
        System.out.println("TESTE COM INTEGER");
        System.out.println("-----------------");
        crudInt.create(objInt1);
        crudInt.create(objInt2);
        crudInt.listar();
        crudInt.update(0, 50);
        crudInt.listar();
        crudInt.delete(1);
        crudInt.listar();
        
        // teste CRUD com Pessoa
        System.out.println("\nTESTE COM PESSOA");
        System.out.println("----------------");
        crudPessoa.create(objPessoa1);
        crudPessoa.create(objPessoa2);
        crudPessoa.listar();
        crudPessoa.update(0, new Pessoa("32145678900", "Pedro", 40, "M", 80.0, 1.70));
        crudPessoa.listar();
        crudPessoa.delete(1);
        crudPessoa.listar();
    }
}

class CRUD<T> {
    private List<T> lista = new ArrayList<>();

    public void create(T obj) {
        this.lista.add(obj);
        System.out.println("Objeto adicionado com sucesso!");
    }
    
    public T read(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            return lista.get(indice);
        } else {
            System.out.println("Índice inválido!");
            return null;
        }
    }
    
    public void update(int indice, T obj) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, obj);
            System.out.println("Objeto atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    
    public void delete(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println("Objeto removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            for (T obj : lista) {
                System.out.println(obj.toString());
            }
        }
    }
}