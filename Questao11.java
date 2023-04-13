// Construa um programa que simule uma transferência bancária, entre duas contas. 
// Primeiro, inicialize cada conta com R$ 100. Depois, permita que o usuário defina quanto deve transferir, 
// da conta1 para a conta2, porém a transferência só deve ser realizada caso haja saldo suficiente.

import java.util.Scanner;

public class Questao11{

    private static class Conta {
        private float saldo = 100.0f;
        
        public float getSaldo(){
            return(this.saldo);
        }

        public void setSaldo(float newSaldo){
            this.saldo = newSaldo;
        }

        public void insertSaldo(float addSaldo){
            float newSaldo = this.getSaldo() + addSaldo;
            this.setSaldo(newSaldo);
        }
    }

    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        System.out.println("Bem vindo ao banco!");
        System.out.println("Digite o valor para transferir para a outra conta: ");
        float valor = inputObj.nextFloat();
        float conta1Saldo = conta1.getSaldo();
        if (conta1Saldo - valor >= 0){
            conta1.setSaldo(conta1Saldo - valor);
            conta2.insertSaldo(valor);
            System.out.println("Transferencia realizada! Seu saldo agora é: " + conta1.getSaldo());
            System.out.println("[DEBUG] Saldo conta2: " + conta2.getSaldo());
        } else {
            System.out.println("Limite indisponível! Seu saldo agora transferencia é: " + conta1.getSaldo());
        }
        
    }
}