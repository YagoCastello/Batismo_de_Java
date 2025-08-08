package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.DESAFIOOOOO3;

public class Main {

    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 25;
        Sasuke.habilidadeEspecial = "Susano";
        Sasuke.missao = "resgatar um gato";
        Sasuke.nivelDificuldade = "fácil";
        Sasuke.statusMissao = "concluído";

        Sasuke.mostrarHabilidadeEspecial();

        Sasuke.mostrarInformacoes();


        System.out.println("---------------------------------------------");
        Ninja Naruto = new Ninja();
        Naruto.nome = "Uzumaki Naruto";
        Naruto.idade = 24;

        Naruto.missao = "resgatar um cachorro";
        Naruto.nivelDificuldade = "fácil";
        Naruto.statusMissao = "Em andamento";


        Naruto.mostrarInformacoes();
    }
}
