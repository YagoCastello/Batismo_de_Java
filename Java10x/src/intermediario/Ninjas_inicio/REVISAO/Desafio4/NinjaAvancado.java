package intermediario.Ninjas_inicio.REVISAO.Desafio4;

public class NinjaAvancado implements Ninja{
    String nome;
    String habilidade;
    int idade;
    public void mostrarInformacoes(){
        System.out.println("'NinjaAvancado' Nome: "+nome+"\nIdade: "+idade+"\nHabilidade: "+habilidade);
    }

    public void executarHabilidade(){
        System.out.println(nome+" está executando 'NinjaAvancado' o(a) "+habilidade);
    }


    public void especialidade(){
        System.out.println("Sou um especialista!");
    }


    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, String habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }
}
