package intermediario.Ninjas_inicio.Overload;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, NivelNinja rank, int numeroDeMissoesConcluidas, int idade, String aldeia) {
        this(nome, aldeia, idade);
        this.rank = rank;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;

    }

    public void MostrarStatus(){
        System.out.println("Nome: "+nome+"\nAldeia: "+aldeia+"\nIdade: "+idade);
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome + " e esse é meu ataque especial");
    }
}
