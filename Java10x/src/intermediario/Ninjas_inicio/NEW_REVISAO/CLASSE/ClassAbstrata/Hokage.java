package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.ClassAbstrata;

public abstract class  Hokage {
    String nome;
    int idade;
    boolean vivo;


    public void  JeitoHokage(){
        System.out.println("Me chamo "+nome+" e sou um Hokage");

    }

    public abstract void golpe();

    public Hokage(String nome, boolean vivo, int idade) {
        this.nome = nome;
        this.vivo = vivo;
        this.idade = idade;
    }

    public Hokage() {
    }
}
