package Iniciante.Scanner_e_input;
import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("2 - Sakura Haruno");
        System.out.println("Escolha um personagem: ");

        //pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();


        System.out.println("Você digitou o numero: "+ escolhaDoUsuario);

        //Reacao ao escolher um personagem

        switch(escolhaDoUsuario){
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha, o ninja revoltado");
                break;
            case 3:
                System.out.println("O usuario escolheu o Sakura Haruno, a ninja médica");
                break;
            default:
                System.out.println("Opção inválida tente usar somente 1,2,3");
        }




        scanner.close();
    }
}
