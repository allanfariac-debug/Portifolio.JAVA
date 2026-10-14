import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===GAME FIRE===");
        System.out.println("Escolha seu personagem:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");

        int opcao = sc.nextInt();
        sc.nextLine();

        Personagem personagem;

        if (opcao == 1) {

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Nivel: ");
            int nivel = sc.nextInt();

            System.out.print("Vida: ");
            int vida = sc.nextInt();
            sc.nextLine();

            System.out.print("Arma: ");
            String arma = sc.nextLine();

            personagem = new Guerreiro(nome, nivel, vida, arma);

        } else {

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Nivel: ");
            int nivel = sc.nextInt();

            System.out.print("Vida: ");
            int vida = sc.nextInt();
            sc.nextLine();

            System.out.print("Tipo de magia: ");
            String magia = sc.nextLine();

            personagem = new Mago(nome, nivel, vida, magia);
        }

        System.out.println("\n=== DADOS DO PERSONAGEM ===");
        personagem.exibirInformacoes();

        System.out.println("\n=== ATAQUE ===");
        personagem.atacar();

        System.out.println("\n=== RECEBER DANO ===");
        personagem.receberDano(30);

        System.out.println( personagem.getNome() +
                " ficou com " +
                personagem.getVida() +
                " de vida."
        );
        System.out.println("\n=== SITUAÇÃO ===");

        if (personagem.estaVivo()) {
            System.out.println(personagem.getNome() + " está vivo.");
        } else {
            System.out.println(personagem.getNome() + " foi derrotado.");
        }
System.out.println("\n=== GOLPE FINAL ===");

        personagem.receberDano(100);

        System.out.println(
                personagem.getNome() +
                " possui " +
                personagem.getVida() +
                " de vida."
        );

        System.out.println("\n=== TENTATIVA DE ATAQUE ===");
        personagem.atacar();

        if (personagem.estaVivo()) {
            System.out.println(personagem.getNome() + " foi derrotado.");
        }

        sc.close();
    }
}