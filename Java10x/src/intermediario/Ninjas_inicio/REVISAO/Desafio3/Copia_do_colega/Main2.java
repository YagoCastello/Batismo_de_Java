package intermediario.Ninjas_inicio.REVISAO.Desafio3.Copia_do_colega;

import intermediario.Ninjas_inicio.REVISAO.Desafio3.Codigo_colega.NinjaD;
import intermediario.Ninjas_inicio.REVISAO.Desafio3.Codigo_colega.UchihaD;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroMaximoDeNinjas = 3;
        int numeroMaximoDeUchihas = 2;
        int numeroDeNinjasCadastrados =0;
        int numeroDeUchihasCadastrados = 0;
        int opcaoSelecionada = 0;


        NinjaD2[] ninjas = new NinjaD2[numeroMaximoDeNinjas];

        UchihaD2[] uchihas = new UchihaD2[numeroMaximoDeUchihas];

        while (opcaoSelecionada != 5){
            System.out.println("\n=== Menu Ninja ===");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Cadastrar Uchiha");
            System.out.println("3. Listar Ninjas");
            System.out.println("4. Listar Uchihas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcaoSelecionada = entrada.nextInt();
            entrada.nextLine();

            switch(opcaoSelecionada){
                case 1 :
                    if(numeroDeNinjasCadastrados < numeroMaximoDeNinjas){
                        System.out.println("\nQual o nome do seu Ninja?");
                        ninjas[numeroDeNinjasCadastrados] = new NinjaD2();
                        ninjas[numeroDeNinjasCadastrados].nome = entrada.nextLine();

                        System.out.println("\nQual a idade do seu Ninja");
                        ninjas[numeroDeNinjasCadastrados].idade = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("\nQual a missao do seu Ninja?");
                        ninjas[numeroDeNinjasCadastrados].missao = entrada.nextLine();

                        System.out.println("\nQual o nível de Dificuldade dessa missão?");
                        ninjas[numeroDeNinjasCadastrados].nivelDificuldade=entrada.nextLine();

                        numeroDeNinjasCadastrados++;
                    }else{
                        System.out.println("Você atingiu o número Máximo de Ninjas cadastrados");
                    } break;

                case 2 :
                    if(numeroDeUchihasCadastrados<numeroMaximoDeUchihas){
                        System.out.println("\nQual o nome do seu Ninja?");
                        uchihas[numeroDeUchihasCadastrados] = new UchihaD2();
                        uchihas[numeroDeUchihasCadastrados].nome = entrada.nextLine();

                        System.out.println("\nQual a idade do seu Ninja");
                        uchihas[numeroDeUchihasCadastrados].idade = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("\nQual a missao do seu Ninja?");
                        uchihas[numeroDeUchihasCadastrados].missao = entrada.nextLine();

                        System.out.println("\nQual o nível de Dificuldade dessa missão?");
                        uchihas[numeroDeUchihasCadastrados].nivelDificuldade=entrada.nextLine();

                        System.out.println("\nQual é o seu poder especial?");
                        uchihas[numeroDeUchihasCadastrados].habilidadeEspecial= entrada.nextLine();

                        numeroDeUchihasCadastrados++;
                    }else{
                        System.out.println("Você atingiu o número Máximo de UCHIHAS cadastrados");
                    }break;

                case 3:
                    System.out.println("\n === LISTA DE NINJAS ===");
                    for (int i = 0; i < numeroDeNinjasCadastrados; i++) {
                        System.out.println("Nome: "+ninjas[i].nome);
                        System.out.println("Idade: "+ninjas[i].idade);
                        System.out.println("Missao: "+ninjas[i].missao);
                        System.out.println("NÍVEL DE DIFICULDADE DA MISSÃO: " + ninjas[i].nivelDificuldade);
                        System.out.println("\n");
                    }break;

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
        entrada.close();
    }
}
