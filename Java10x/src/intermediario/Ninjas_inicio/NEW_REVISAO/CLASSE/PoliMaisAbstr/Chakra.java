package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.PoliMaisAbstr;

public abstract class Chakra implements GolpeChakra{
    int quantidade;
    String elemento;
    int portoes;

    public void liberacaoDeChakra(){
        System.out.println("Você está liberando chakra!!");
    }

    @Override
    public void golpeDechakraSemElemento(){
        System.out.println("Concentrei o chakra na minha mão e dei um golpe");
    }
@Override
    public void golpeDechakraSemElementoComElemento(){
    System.out.println("Concentrei o chakra no meu pé e dei um golpe com o chakra do elemento fogo");

}


    public Chakra() {
    }


    public Chakra(int quantidade, int portoes, String elemento) {
        this.quantidade = quantidade;
        this.portoes = portoes;
        this.elemento = elemento;
    }
}
