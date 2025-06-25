package intermediario.Ninjas_inicio.Kakashi_o_ninja_que_copiava;

import intermediario.Ninjas_inicio.Overload.NivelNinja;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;



    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int numeroDeMissoesConcluidas, int idade, NivelNinja rank) {
        this(nome,aldeia,idade);
        this.idade = idade;
        this.rank = rank;
    }

    public Ninja() {
    }
    public void  MostrarHabilidades(){
        System.out.println("NOME: "+nome+"\nALDEIA: "+aldeia+"\nIDADE: "+idade);
    }

}
