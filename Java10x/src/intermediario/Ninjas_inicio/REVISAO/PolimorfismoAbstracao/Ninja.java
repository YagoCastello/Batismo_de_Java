package intermediario.Ninjas_inicio.REVISAO.PolimorfismoAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    int idade;
    String aldeia;

    public void habilidadeEspecial(){
        System.out.println("Habilidade especial generica!");
    }
    public abstract void estrategiaDeCombate();


    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Estrategiiii");
    }
}
