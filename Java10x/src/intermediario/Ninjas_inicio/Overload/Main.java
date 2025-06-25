package intermediario.Ninjas_inicio.Overload;

public class Main {
    public static void main(String[] args) {

        Uchiha Madara = new Uchiha("Madara Uchiha",NivelNinja.KAGE,900,50,"Aldeida da folha");
        Madara.MostrarStatus();
        Madara.habilidadeEspecial();
        System.out.println(Madara.rank);
    }
}
