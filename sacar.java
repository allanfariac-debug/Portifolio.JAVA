package ProjetoJava.src;

public class sacar {
    void sacar(ContaCorrente contaAlvo, double valor){
    if(contaAlvo.saldo >= valor){
        contaAlvo.saldo = contaAlvo.saldo - valor;
        System.out.println("Saque" + valor);
    }else{
        System.out.println("SAque negado!");
    }
 
}}
       
