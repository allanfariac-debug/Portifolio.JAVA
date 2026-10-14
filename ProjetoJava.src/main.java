package ProjetoJava.src;

public class main {
    public static void main(String[] args) {
        
    //1. Cria os dados do Objeto(Pessoa tem uma conta corrente)
    ContaCorrente minhaConta = new ContaCorrente();
    minhaConta.nomeUser = "Ronaldo";
    minhaConta.saldo =  0.0;

    // 2. Criamos as Ações
    depositar acaoDeposito = new depositar();
    sacar acaoSaque = new sacar();

    System.out.println("Começando operação!");

    //Funçoes objetos.
    acaoDeposito.depositar(minhaConta, 150.0);
    acaoSaque.sacar(minhaConta, 200.0);   

 }}