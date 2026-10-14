public class Main {
    
public static void main(String[] args) {
    
    contacorrente contacorrente = new contacorrente();

//deposito deposito = new deposito();

//deposito.depositar();


saque saque = new saque ();

saque.saque();



contacorrente.saldo = 1000000;
contacorrente.banco = "brasil";
contacorrente.nomeUser = "Allan";
contacorrente.numconta = 11111;
contacorrente.unidade = "008";
contacorrente.ativo = true;

System.out.println("saldo: " + contacorrente.saldo);
System.out.println("banco: " + contacorrente.banco);
System.out.println("nomeUser: " + contacorrente.nomeUser);
System.out.println("numconta: " + contacorrente.numconta); 
System.out.println("unidade: " + contacorrente.unidade); 
System.out.println("ativo: " + contacorrente.ativo); 




}



}
