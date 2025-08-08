package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.DESAFIOOOOO3;


import java.util.Scanner;

public class Maninho {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int cheio = 3;
            int opcao = 0;
            int cadastrados = 0;


// Criando um vetor de 3 Posições.
            Uchiha[] claUchiha = new Uchiha[cheio];


            while (opcao != 4) {
                System.out.println("___________________Menu Interativo__________________");
                System.out.println("1 - Adicionar um novo ninja!");
                System.out.println("2 - Mostrar os ninjas");
                System.out.println("3 - Atualizar habilidade especial");
                System.out.println("4 - Sair");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir o espaço


                switch (opcao) {
                    case 1:
                        if (cadastrados < cheio) {
                            claUchiha[cadastrados] = new Uchiha();
                            System.out.println("Informe o nome do ninja: ");
                            claUchiha[cadastrados].nome = scanner.nextLine();
                            System.out.println("Informe a idade do ninja: ");
                            claUchiha[cadastrados].idade = scanner.nextInt();
                            scanner.nextLine(); // Consumir o espaço.
                            System.out.println("Informe a missão do ninja: ");
                            claUchiha[cadastrados].missao = scanner.nextLine();
                            System.out.println("Informe o nivel de dificuldade da missao: ");
                            claUchiha[cadastrados].nivelDificuldade = scanner.nextLine();
                            System.out.println("Informe o status da missão: ");
                            claUchiha[cadastrados].statusDaMissao = scanner.nextLine();
                            System.out.println("Informe a habilidade especial do ninja: ");
                            claUchiha[cadastrados].habilidadeEspecial = scanner.nextLine();
                            cadastrados++;
                        } else {
                            System.out.println("A lista de ninjas está cheia.");
                        }
                        break;
                    case 2:
                        if (cadastrados == 0) {
                            System.out.println("Não tem nenhum ninja cadastrado!");
                        } else {
                            System.out.println("Ninjas Cadastrados: ");
                            for(int i = 0; i < cadastrados; i++){
                                System.out.println("Nome: " + claUchiha[i].nome);
                                System.out.println("Idade: " + claUchiha[i].idade);
                                System.out.println("Missão: " + claUchiha[i].missao);
                                System.out.println("Nível da missão: " + claUchiha[i].nivelDificuldade);
                                System.out.println("Status da missão: " + claUchiha[i].statusDaMissao);
                                System.out.println("Habilidade especial: " + claUchiha[i].habilidadeEspecial);
                            }
                        }
                        break;
                    case 3:
                        if(cadastrados == 0){
                            System.out.println("Não tem ninjas cadastrados, impossível mudar a habilidade especial.");
                        }else{
                            System.out.println("Informe o nome do ninja que você quer mudar a habilidade especial: ");
                            String ninjaEscolhido = scanner.nextLine();
                            for(int j = 0; j < cadastrados; j++){
                                if(ninjaEscolhido.equalsIgnoreCase(claUchiha[j].nome)){
                                    System.out.println("Você escolheu mudar a habilidade do ninja: " + claUchiha[j].nome);
                                    System.out.println("Escolha o nome da nova habilidade: ");
                                    claUchiha[j].habilidadeEspecial = scanner.nextLine();
                                    System.out.println("Habilidade Atualizada com sucesso!");
                                    break;
                                }else{
                                    System.out.println("Ninja não encontrado!");
                                }
                            }


                        }
                        break;
                    case 4:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Você não escolheu uma opção valida!");
                }


            }


            scanner.close();


        }
}