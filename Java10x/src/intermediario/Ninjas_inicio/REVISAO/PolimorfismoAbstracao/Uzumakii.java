package intermediario.Ninjas_inicio.REVISAO.PolimorfismoAbstracao;

public class Uzumakii extends Ninja{

    @Override
    public void habilidadeEspecial(){
        System.out.println("habilidade UZUMAKI");
    }

    public void estrategiaDeCombate(){
        System.out.println(nome+ " invocou um sapo gigante");
    }
}
