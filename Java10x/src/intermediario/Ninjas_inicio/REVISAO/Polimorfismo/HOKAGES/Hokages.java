package intermediario.Ninjas_inicio.REVISAO.Polimorfismo.HOKAGES;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    //no arguments
    public Hokages(){

    }

    public Hokages(String nome){
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }

    public Hokages(String nome, boolean vivoOuNao, int idade) {
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
    }
}

