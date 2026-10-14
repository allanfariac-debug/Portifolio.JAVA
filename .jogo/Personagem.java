import javax.print.DocFlavor.STRING;

public class Personagem {
    String nome;
    private int vida;

public Personagem(String Nomescolhido){
     this.nome = nomeescolhido
     this.vida = 100
    System.out.println("Aqui nasce o Heroi");
}

    void tomarpocaoCurativa(int cura){
    vida = vida + cura;
    if (vida > 100){
        vida = 100;
    }
    System.out.println("Vida" + cura);


    }
   void receberDano (int dano);
    vida = vida - dano;
    if (vida <= 0){
        vida = 0

        System.out.println("Voce foi derrotado");
    }else{
        System.out.println("Sofreu dano" + dano);
    }
}