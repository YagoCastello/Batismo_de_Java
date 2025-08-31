package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.PoliMaisAbstr;

public class UsuarioDeChakra extends Chakra{

    public void UsuarioDeChakra(){
        System.out.println("Sou um usuario de chakra!!!!!!!!!!!");
    }

    public UsuarioDeChakra(){
        super();
    }


    public UsuarioDeChakra(int quantidade, int portoes, String elemento) {
        super(quantidade, portoes, elemento);
    }
}
