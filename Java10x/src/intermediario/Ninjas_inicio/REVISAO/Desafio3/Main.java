package intermediario.Ninjas_inicio.REVISAO.Desafio3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ninja kohanamaru = new Ninja();
        kohanamaru.nome ="Kohanamaru senju";
        kohanamaru.idade =13;
        kohanamaru.missao="resgatar um gato";
        kohanamaru.statusMissao="Andamento";
        kohanamaru.nivelDificuldade="F";
        kohanamaru.mostrarInformacoes();

        System.out.println("------------------------------------------------------------");


        Uchiha Itachi = new Uchiha();
        Itachi.nome= "Itachi Uchiha";
        Itachi.idade= 29;
        Itachi.habilidadeEspecial="Susano";
        Itachi.missao="Se infiltrar na Akatsuki";
        Itachi.nivelDificuldade="s+";
        Itachi.statusMissao="Concluído";
        Itachi.mostrarInformacoes();
        Itachi.mostrarHabilidadeEspecial();

        Scanner entrada = new Scanner(System.in);
        String[] Ninjas= new String[3];




        entrada.close();
    }
}
