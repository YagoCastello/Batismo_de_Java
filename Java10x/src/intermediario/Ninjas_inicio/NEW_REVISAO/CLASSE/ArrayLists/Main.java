package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array

        //São estaticos, nao alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        System.out.println(ninjasArray[1]);


        //listas
        //são estaticos, não alteram de tamanho
        List<String> ninjas = new ArrayList<>();
        ninjas.add("iruma");
        ninjas.add("kakashi");
        ninjas.add("tsunade");

        System.out.println(ninjas);
        ninjas.remove("kakashi");
        System.out.println(ninjas);

    }
}
