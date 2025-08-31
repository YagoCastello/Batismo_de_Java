package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.ComoNAOquebrarOscript;

public class Uchiha extends Ninja{

    public void AtaqueUchiha(){
        System.out.println("Eu sou um Uchiha e esse é o meu ataque Uchiha!!!!!");
    }




    public void meuRank() {
        System.out.println("Me chamo " + nome + " e meu rank é " + NivelDeNinja);
    }
    public Uchiha(String nome, String vila, int idade) {
        super(nome, vila, idade);
    }

    public Uchiha() {
    }

        public Uchiha(String nome, String vila, int idade,  Rank NivelDeNinja, boolean vivo) {
        super(nome, vila, idade,  NivelDeNinja, vivo);
    }
}
