package ProjetoJava.src;

public class depositar {
    
    void depositar(ContaCorrente contaAlvo, double valor){
        contaAlvo.saldo = contaAlvo.saldo + valor;
        System.out.println("Deposito " + valor);
        
    }
} 