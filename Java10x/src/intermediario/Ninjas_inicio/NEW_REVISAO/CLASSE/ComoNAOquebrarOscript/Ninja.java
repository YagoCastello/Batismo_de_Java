package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.ComoNAOquebrarOscript;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    int idade;
    String vila;
    Rank NivelDeNinja;
    boolean vivo;

    public void mostrarInformacoes(){
        System.out.println("Oi eu sou o "+nome+" e tenho "+idade+" anos e sou da "+vila);
    }

    public void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é a minha estratégia de BATALHA ninja");
    }
    public void estrategiaDeCombate(){
        System.out.println("Essa é aminha estratégia de COMBATEEEEEEEEEE");
    }

    public void estrategiaDeCombate(int qi){
        if (qi<85){
            System.out.println("meu qi: "+qi);
        } else if (qi<120) {
            System.out.println("Sou inteligente meu qi é : "+qi);

        }else {
            System.out.println("Sou um gênio com o meu qi de : "+qi);
        }
    }

    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    public Ninja() {
    }

    public Ninja(String nome,  String vila,int idade, Rank nivelDeNinja, boolean vivo) {
        this(nome, vila, idade);
        this.NivelDeNinja = nivelDeNinja;
        this.vivo = vivo;
    }


}
