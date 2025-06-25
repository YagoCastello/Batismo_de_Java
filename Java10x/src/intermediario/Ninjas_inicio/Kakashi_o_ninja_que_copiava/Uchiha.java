package intermediario.Ninjas_inicio.Kakashi_o_ninja_que_copiava;

public class Uchiha extends Ninja implements Sharigan{

    public void SouUmUchiha(){
        System.out.println("Sou membro do clã Uchiha! E por isso sou muito com jutsus de fogo");
    }

    @Override
    public void ShariganAtivado() {
        System.out.println("Sou um Uchiha e o meu sharigan ativou");
    }
}
