package intermediario.Ninjas_inicio.REVISAO.ClasseAbstrata;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokages() {
    }

    public Hokages(String nome, boolean vivoOuNao, int idade, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
    public abstract void sabedoriaHokage();
}

