package desafios;
import java.util.Scanner;
public class desafio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("numero do array: ");
        int nArray = entrada.nextInt();
        entrada.nextLine(); // Corrige a quebra de linha que fica no buffer

        String[] teste = new String[nArray];
        int contador = 0;
        boolean estado = true;
        while (estado) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int resposta = entrada.nextInt();
            entrada.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            switch (resposta) {
                case 1:
                    if (contador<nArray){

                        System.out.println("Digite o nome do ninja: ");
                        String palavra = entrada.nextLine();
                        teste[contador] = palavra;
                        contador ++;
                        break;
                    }else{
                        System.out.println("---------------------------");
                        System.out.println("LIMITE ALCANÇADO!!");
                        System.out.println("---------------------------");
                    }
                case 2:
                    System.out.println("2");
                    for (int i = 0; i < nArray; i++) {
                        System.out.println(teste[i]);

                    }
                    break;
                case 3:
                    System.out.println("Fim do programa!!");
                    estado = false;
                default:
                    System.out.println("DIGITE UMA OPÇÃO VÁLIDA!!!");


            }
        }
    }
}