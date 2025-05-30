package intermediario.Ninjas_inicio.REVISAO;

public class Ninja {
    String nome;
    String aldeia;
    int idade;


    /* Criar um metodo Publico personalizado
    O metodo VOID não retorna valor nenhum*
    * */


  /* O metodo STRING vai ter que retornar uma STRING *
   */
    public  String EuSouUmNinja(){
        return  "Oi, Eu sou um ninja!";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
