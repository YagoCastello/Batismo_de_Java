package intermediario.Ninjas_inicio.REVISAO.Desafio4;

public class Main {
    public static void main(String[] args) {



        NinjaBasico Saki = new NinjaBasico();
        Saki.nome ="Saki Pau";
        Saki.idade =19;
        Saki.habilidade ="jato de lama";

        Saki.executarHabilidade();
        Saki.mostrarInformacoes();

        System.out.println("-------------------------------------------------");

        NinjaAvancado Pitou = new NinjaAvancado();
        Pitou.nome = "Pitou Komeku";
        Pitou.idade = 23;
        Pitou.habilidade = "Teia de Nen";
        Pitou.executarHabilidade();
        Pitou.mostrarInformacoes();
        Pitou.especialidade();

        System.out.println("-------------------------------------------------");
        NinjaBasico Busta = new NinjaBasico("Busta Nokano",41,"Golpe de gelo");
        Busta.mostrarInformacoes();
        Busta.executarHabilidade();

        System.out.println("-------------------------------------------------");



        NinjaAvancado Shan = new NinjaAvancado("Shan Hike","Golpe de lava",43);
        Shan.mostrarInformacoes();
        Shan.executarHabilidade();
        Shan.especialidade();

    }
}
