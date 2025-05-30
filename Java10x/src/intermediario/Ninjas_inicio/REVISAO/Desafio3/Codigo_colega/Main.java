package intermediario.Ninjas_inicio.REVISAO.Desafio3.Codigo_colega;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Abrir Scanner (1)
        Scanner caixaDeTexto = new Scanner(System.in);

        //Variáveis (2)
        int numeroMaximoDeNinjas = 3;
        int numeroMaximoDeUchihas = 2;
        int numeroDeNinjasCadastrados = 0;
        int numeroDeUchihasCadastrados = 0;
        int opcaoSelecionada = 0;

        //Lista dos Ninjas (3)
        NinjaD[] ninjas = new NinjaD[numeroMaximoDeNinjas];

        //Lista dos Uchihas (4)
        UchihaD[] uchihas = new UchihaD[numeroMaximoDeUchihas];

        //While para o Menu (5)
        while (opcaoSelecionada != 5) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Cadastrar Uchiha");
            System.out.println("3. Listar Ninjas");
            System.out.println("4. Listar Uchihas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcaoSelecionada = caixaDeTexto.nextInt();
            caixaDeTexto.nextLine(); //buffer para limpar teclado

            switch(opcaoSelecionada) {
                case 1:
                    if (numeroDeNinjasCadastrados < numeroMaximoDeNinjas) {

                        System.out.println("\nQual o nome do seu Ninja?");
                        ninjas[numeroDeNinjasCadastrados] = new NinjaD();
                        ninjas[numeroDeNinjasCadastrados].nome = caixaDeTexto.nextLine();

                        System.out.println("\nQual a idade do seu Ninja");
                        ninjas[numeroDeNinjasCadastrados].idade = caixaDeTexto.nextInt();
                        caixaDeTexto.nextLine(); //buffer para limpar teclado

                        System.out.println("\nQual a missão do seu Ninja?");
                        ninjas[numeroDeNinjasCadastrados].missao = caixaDeTexto.nextLine();

                        System.out.println("\nQual o nível de Dificuldade dessa missão?");
                        ninjas[numeroDeNinjasCadastrados].nivelDificuldade = caixaDeTexto.nextLine();

                        numeroDeNinjasCadastrados++;
                    } else {
                        System.out.println("Você atingiu o número Máximo de Ninjas Cadastrados.");
                    }
                    break;

                case 2:
                    if (numeroDeNinjasCadastrados < numeroMaximoDeNinjas) {

                        System.out.println("\nQual o nome do seu Uchiha?");
                        uchihas[numeroDeUchihasCadastrados] = new UchihaD();
                        uchihas[numeroDeUchihasCadastrados].nome = caixaDeTexto.nextLine();

                        System.out.println("\nQual a idade do seu Uchiha");
                        uchihas[numeroDeUchihasCadastrados].idade = caixaDeTexto.nextInt();
                        caixaDeTexto.nextLine(); //buffer para limpar teclado

                        System.out.println("\nQual a missão do seu Uchiha?");
                        uchihas[numeroDeUchihasCadastrados].missao = caixaDeTexto.nextLine();

                        System.out.println("\nQual o nível de Dificuldade dessa missão?");
                        uchihas[numeroDeUchihasCadastrados].nivelDificuldade = caixaDeTexto.nextLine();

                        System.out.println("\nQual a habilidade especial deste Uchiha?");
                        uchihas[numeroDeUchihasCadastrados].habilidadeEspecial = caixaDeTexto.nextLine();

                        numeroDeUchihasCadastrados++;
                    } else {
                        System.out.println("Você atingiu o número Máximo de Uchihas Cadastrados.");
                    }
                    break;

                case 3:
                    System.out.println("\n ===== LISTA DE NINJAS =====");
                    for (int i = 0; i < numeroDeNinjasCadastrados; i++) {
                        System.out.println("NOME: " + ninjas[i].nome);
                        System.out.println("IDADE: " + ninjas[i].idade);
                        System.out.println("MISSÃO: " + ninjas[i].missao);
                        System.out.println("NÍVEL DE DIFICULDADE DA MISSÃO: " + ninjas[i].nivelDificuldade);
                        System.out.println("\n");
                    }
                    break;

                case 4:
                    System.out.println("\n ===== LISTA DE UCHIHAS =====");
                    for (int i = 0; i < numeroDeUchihasCadastrados; i++) {
                        System.out.println("NOME: " + uchihas[i].nome);
                        System.out.println("IDADE: " + uchihas[i].idade);
                        System.out.println("MISSÃO: " + uchihas[i].missao);
                        System.out.println("NÍVEL DE DIFICULDADE DA MISSÃO: " + uchihas[i].nivelDificuldade);
                        System.out.println("HABILIDADE ESPECIAL: " + uchihas[i].habilidadeEspecial);
                        System.out.println("\n");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

        caixaDeTexto.close();
    }
}