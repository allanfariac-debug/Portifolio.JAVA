public class Mago extends Personagem {
    
    private String magia;

    public Mago(String nome,
       int nivel,
       int vida,
       String magia) {
        super(nome, nivel, vida);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

        @Override
    public void atacar() {
            if (estaVivo()) {
            System.out.println(
                getNome() + " lançou uma magia do tipo: " + magia );
        } else {
            System.out.println(getNome() + " está derrotado e não pode atacar.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Magia: " + magia);
    }
}