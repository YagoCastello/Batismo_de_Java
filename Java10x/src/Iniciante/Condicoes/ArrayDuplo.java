package Condicoes;

public class ArrayDuplo {
    public static void main(String[] args) {
        String [][] ninjasEaldeias = new String[3][3];

        ninjasEaldeias[0][0]="Konoha";
        ninjasEaldeias[0][1]="Naruto";
        ninjasEaldeias[0][2]="Sasuke";

        ninjasEaldeias[1][0]="Nevoa";
        ninjasEaldeias[1][1]="zabuza";
        ninjasEaldeias[1][2]="haku";

        ninjasEaldeias[2][0]="Areia";
        ninjasEaldeias[2][1]="Gaara";
        ninjasEaldeias[2][2]="Temari";

        for (int i = 0; i < 3; i++) {
            System.out.println("-------------------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(ninjasEaldeias[i][j]);
            }
        }
    }
}
