package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.ComoNAOquebrarOscript;

public class Main {
    public static void main(String[] args) {
        Uchiha itachi = new Uchiha("Itachi Uchiha","vila da folha",35);
        itachi.AtaqueUchiha();
        itachi.mostrarInformacoes();
        itachi.meuRank();
        itachi.estrategiaDeCombate(250);

        Uchiha shisui = new Uchiha("Shisui uchiha","Vila da folha",23,Rank.Gennin,false);
        shisui.AtaqueUchiha();
        shisui.meuRank();
        shisui.estrategiaDeCombate(50);
    }
}
