package intermediario.Ninjas_inicio.REVISAO.Desafio4;

import intermediario.Ninjas_inicio.Naruto;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    public void mostrarInformacoes(){
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nHabilidade: "+habilidade);
    }

    public void executarHabilidade(){
        System.out.println(nome+" está executando o(a) "+habilidade);
    }

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}
