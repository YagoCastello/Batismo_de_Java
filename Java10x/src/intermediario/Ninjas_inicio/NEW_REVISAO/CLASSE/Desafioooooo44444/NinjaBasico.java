package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.Desafioooooo44444;

public class NinjaBasico implements Ninja{


    int idade;
    String habilidade;
    String nome;
    public void mostarInformacoes()
    {
        System.out.println("Oi eu sou o(a) "+nome+" e tenho "+idade+" anos"+"e a minha habilidade é : "+habilidade);

    }

    public void executarHabilidade(){
        System.out.println("Lá vai! Jutsu: "+habilidade);

    }

    public NinjaBasico(String habilidade, int idade, String nome) {
        this.habilidade = habilidade;
        this.idade = idade;
        this.nome = nome;
    }
}
