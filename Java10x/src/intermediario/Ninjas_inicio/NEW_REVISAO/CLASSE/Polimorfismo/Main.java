package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Narutoooo";
        naruto.idade = 15;
        naruto.aldeia = "Aldeia do gramado";
        naruto.habilidadeEspecial();
        System.out.println("-------------------------------------");

        Uchiha shisui = new Uchiha();
        shisui.nome = "Shisuiiiiiiii";
        shisui.idade = 19;
        shisui.aldeia = "Aldeia do campinho";
        shisui.habilidadeEspecial();
        System.out.println("-------------------------------------");



        Ninja pedro= new Ninja();
        pedro.nome = "pedroooooooooooooo";
        pedro.idade = 19;
        pedro.aldeia = "Aldeia do vale";
        pedro.habilidadeEspecial();
        System.out.println("-------------------------------------");

    }
}
