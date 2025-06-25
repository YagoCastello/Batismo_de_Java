package intermediario.Ninjas_inicio.REVISAO.PolimorfismoAbstracao;

import intermediario.Ninjas_inicio.Overload.Uchiha;

public class Main {
    public static void main(String[] args) {



        Uchihaa Shisui = new Uchihaa();
        Shisui.nome = "Shisui Uchihaa";
        Shisui.aldeia = "Aldeia da folha";

        Shisui.inteligenciaDeCombate();
        Shisui.inteligenciaDeCombate(129);

        System.out.println(Shisui);
    }
}
