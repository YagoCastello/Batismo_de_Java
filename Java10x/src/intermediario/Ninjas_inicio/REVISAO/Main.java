package intermediario.Ninjas_inicio.REVISAO;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja Naruto - Naruto é um OBJETO
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Aldeida da Folha";
        Naruto.ModoSabio();


        //Criar o ninja Sasuke - Sasuke é um OBJETO
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome= "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia="Aldeida da Folha";
        Sasuke.ShariganAtivado();

        //Aplicando Metodos aos meus objetos

        String ChamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(ChamandoMetodo);
        int IdadeHokageSasuke = Sasuke.anosParaSeTornarHokage(50);
        System.out.println("Você tem: "+Sasuke.idade+" anos. Falta "+ IdadeHokageSasuke+ " anos para se tornar hokage");


        //Criar o ninja Sakura - Sakura é um OBJETO
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade =16;
        Sakura.aldeia= "Aldeida da Folha";
        Sakura.Cura();

        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.idade = 17;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.AtivarByakugan();


        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki Hyuuga";
        Boruto.idade = 13;
        Boruto.aldeia = "Aldeia da folha";
        Boruto.ModoSabio();
        Boruto.AtivarJougan();




    }
}
