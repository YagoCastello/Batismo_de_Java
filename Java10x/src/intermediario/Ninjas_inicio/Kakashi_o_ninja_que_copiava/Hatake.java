package intermediario.Ninjas_inicio.Kakashi_o_ninja_que_copiava;

public class Hatake extends Ninja implements Sharigan,Anbu,Hokage {

    public void SouHatake(){
        System.out.println("Eu "+nome+" sou um hatake!");
    }

    @Override
    public void ShariganAtivado() {
        System.out.println("Sou um Hatake e roubei um sharigan de um otário!");
    }

    @Override
    public void bemVindoAAnbu() {
        System.out.println("Sou membro da anbu!");
    }

    @Override
    public void HokaeAtivo() {
        System.out.println("Sou um Hatake e um HOKAGE!");
    }
}
