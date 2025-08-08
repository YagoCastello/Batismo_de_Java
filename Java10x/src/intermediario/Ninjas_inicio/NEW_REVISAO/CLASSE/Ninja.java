package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE;

public class Ninja {
    String nome;
    String aldeia;
    int idade;




    public  String EuSouUmNinja(){
        return "Eu sou um Ninja!!";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
