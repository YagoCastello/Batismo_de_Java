package intermediario.Ninjas_inicio.Kakashi_o_ninja_que_copiava;

public class Main {
    public static void main(String[] args) {
        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi hatake";
        Kakashi.idade = 42;
        Kakashi.aldeia = "Aldeia da folha";
        Kakashi.MostrarHabilidades();
        Kakashi.ShariganAtivado();
        Kakashi.bemVindoAAnbu();
        Kakashi.HokaeAtivo();
        System.out.println(" ");

        //TODO incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank

        Uchiha Itachi = new Uchiha();
        Itachi.nome = "Itachi Uchiha";
        Itachi.idade = 35;
        Itachi.aldeia = "Aldeia da folha";
        Itachi.MostrarHabilidades();
        Itachi.ShariganAtivado();


    }


}
