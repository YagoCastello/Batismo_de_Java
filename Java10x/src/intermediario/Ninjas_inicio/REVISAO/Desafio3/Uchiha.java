package intermediario.Ninjas_inicio.REVISAO.Desafio3;

public class Uchiha extends  Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println(nome+ " Possuí a habilidade especial: "+habilidadeEspecial);
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Missão: "+missao);
        System.out.println("Nivel da missão: "+nivelDificuldade);
        System.out.println("Status da Missão: "+statusMissao);
        System.out.println("Habilidade ESPECIAL: "+habilidadeEspecial);
    }
}
