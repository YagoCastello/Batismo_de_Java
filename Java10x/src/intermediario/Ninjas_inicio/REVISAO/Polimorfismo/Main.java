package intermediario.Ninjas_inicio.REVISAO.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome= "Sasuke Uchiha";
        Sasuke.habilidadeEspecial();

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome= "Naruto Uzumaki";
        Naruto.habilidadeEspecial();

        Ninja Gedo = new Ninja();
        Gedo.nome = "Gedo Seno";
        Gedo.habilidadeEspecial();
    }
}
