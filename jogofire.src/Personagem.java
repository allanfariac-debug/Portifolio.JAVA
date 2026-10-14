public class Personagem {

    private String nome;
    private int nivel;
    private int vida;

    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public void atacar() {
        if (estaVivo()) {
            System.out.println(nome + " realizou um ataque!");
        } else {
            System.out.println(nome + " está derrotado e não pode atacar.");
        }
    }

    public void receberDano(int dano) {
        if (dano > 0) {
            vida -= dano;

            if (vida < 0) {
                vida = 0;
            }
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
    }
}