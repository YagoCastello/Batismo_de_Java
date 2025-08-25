package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.Desafioooooo44444;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especiliadade;


    public void mostarInformacoes()
    {
        System.out.println("Oi eu sou o(a) "+nome+" e tenho "+idade+" anos"+" e a minha habilidade é : "+habilidade);
        System.out.println("E a minha especialidade é :"+especiliadade);
    }

    public void executarHabilidade(){
        System.out.println("Estou ativando a minha especialidade de :"+especiliadade+" E vou utilizar o meu jutsu. Lá vai! Jutsu: "+habilidade);

    }

    public NinjaAvancado(String nome, String especiliadade, String habilidade, int idade) {
        this.nome = nome;
        this.especiliadade = especiliadade;
        this.habilidade = habilidade;
        this.idade = idade;
    }
}
