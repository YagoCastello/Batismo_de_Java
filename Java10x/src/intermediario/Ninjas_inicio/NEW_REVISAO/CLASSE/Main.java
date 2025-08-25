package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE;

public class Main {

    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome ="Naruto Uzucraque";
        Naruto.idade = 76;
        Naruto.aldeia = "vila da palmeira";
        Naruto.ModoSabio();


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Otira";
        Sasuke.idade = 24;
        Sasuke.aldeia = "aldeida da sambambaia";
        Sasuke.ShariganAtivado();
        System.out.println(Sasuke.EuSouUmNinja());
        String ChamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(ChamandoMetodo);
        int idadeHokageSasuke = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Nome: "+Sasuke.nome+"\nIdade: "+Sasuke.idade+"\nE falta "+idadeHokageSasuke + " ano(s) para se tornar um hokage");


        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura haruken";
        Sakura.idade = 90;
        Sakura.aldeia = "Vila da moita";
        Sakura.AtivandoCura();

        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata hitalina";
        Hinata.idade = 18;
        Hinata.aldeia = "Aldeia dos cegos";
        Hinata.AtivandoOByakugan();



        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto uzumali";
        Boruto.idade = 9;
        Boruto.aldeia = "Aldeia das flores";
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();

    }
}
