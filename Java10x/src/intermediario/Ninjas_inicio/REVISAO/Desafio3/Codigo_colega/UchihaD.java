package intermediario.Ninjas_inicio.REVISAO.Desafio3.Codigo_colega;

public class UchihaD extends NinjaD{
    String habilidadeEspecial;

    @Override
    public void mostrarInformacoes () {
        super.mostrarInformacoes();
        System.out.println("A habilidade especial do Uchiha é " + habilidadeEspecial);
    }
}
