public class Guerreiro extends Personagem{
    
   private String arma;
    public Guerreiro (
      String nome , 
      int nivel, 
      int vida, 
      String arma) {
        
        super (nome, nivel, vida);
        this.arma = arma;
    }
    public String getArma() {
        return arma;
    }
    @Override
    public void atacar() {
        if (estaVivo()) {
            System.out.println(
                getNome() + " atacou usando sua arma: " + arma
            );
        } else {
            System.out.println(getNome() + " está derrotado e não pode atacar.");
      }
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Arma: " + arma);
    }
}