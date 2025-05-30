package intermediario.Ninjas_inicio.REVISAO.Polimorfismo.HOKAGES;

public class Main {
    public static void main(String[] args) {
        Hokages Hashirama = new Hokages();
        Hashirama.nome = "Hashirama Senju";

        Hokages Tobirama = new Hokages("Tobirama Senju");


        Hokages Hiruzen = new Hokages(77);


        Hokages Minato = new Hokages("Minato Namikaze",false,36);
    }
}
