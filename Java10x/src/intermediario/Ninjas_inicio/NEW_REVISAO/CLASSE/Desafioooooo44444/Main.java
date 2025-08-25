package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.Desafioooooo44444;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Konan = new NinjaBasico("Jutsu de papel",32,"Konan da silva");
        Konan.mostarInformacoes();
        Konan.executarHabilidade();
        System.out.println(" ");

        NinjaAvancado Pain = new NinjaAvancado("Pain da costa","rinnegan","Shira tensei",32);
        Pain.mostarInformacoes();
        Pain.executarHabilidade();
    }
}
