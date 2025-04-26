package Condicoes;

public class If_e_Else {

    public static void main(String[] args) {

    /*IF e Else - condicoes
    Objetivo: Passar o ninja de nivel de acordo com o numero de missões

    * */

        //Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;


        //Se (condicao) {faça isso}

        if (numeroDeMissoes  > 10) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >=20) {
            System.out.println("Rank: Jounin");

        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
