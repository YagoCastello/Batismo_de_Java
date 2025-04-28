package Iniciante.desafios;


import java.util.Scanner;
public class desafio2deepseek {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de ninjas a cadastrar: ");
        int nArray = entrada.nextInt();
        entrada.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        String[] ninjas = new String[nArray];
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
                    if (contador < nArray) {
                        System.out.print("Digite o nome do ninja: ");
                        String nomeNinja = entrada.nextLine();
                        ninjas[contador] = nomeNinja;
                        contador++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de ninjas atingido!");
                    }
                    break;
                case 2:
                    System.out.println("\n=== Lista de Ninjas ===");
                    if (contador == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Fim do programa!!");
                    estado = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        entrada.close();
    }
}