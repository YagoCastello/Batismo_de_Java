package intermediario.Ninjas_inicio.REVISAO.Desafio3;

import java.util.SplittableRandom;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Missão: "+missao);
        System.out.println("Nivel da missão: "+nivelDificuldade);
        System.out.println("Status da Missão: "+statusMissao);
    }
}
