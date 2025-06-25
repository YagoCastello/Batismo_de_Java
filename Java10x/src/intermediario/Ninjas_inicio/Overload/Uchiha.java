package intermediario.Ninjas_inicio.Overload;

public class Uchiha extends Ninja{
    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {

        super(nome,aldeia,idade);
    }

    public Uchiha(String nome, NivelNinja rank, int numeroDeMissoesConcluidas, int idade, String aldeia) {
        super(nome, rank, numeroDeMissoesConcluidas, idade, aldeia);
    }

    //sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome + " e esse é meu ataque especial UCHIHA!!!!!!!!!!");

    }
}
