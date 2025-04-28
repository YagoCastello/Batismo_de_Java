package Iniciante.desafios;



public class desafio_1_facil {
    public static void main(String[] args) {
        String nome1 = "Naruto";
        String nome2 = "Sasuke";
        String nome3 = "Sakura";

        int idade1 = 15;
        int idade2 = 14;
        int idade3 = 15;


        String missao1 ="limpar o rio";
        String missao2 ="pegar o gato";
        String missao3 ="catar lata";


        String statusDaMissao1  ;
        String statusDaMissao2;
        String statusDaMissao3;


        char nivelDaMissao1 = 'E';
        char nivelDaMissao2 = 'A';
        char nivelDaMissao3 = 'S';


        if (idade1>=15){
            statusDaMissao1 = "CONCLUIDO";
        } else if (nivelDaMissao1 =='C' || nivelDaMissao1 =='D' || nivelDaMissao1 =='E') {
            statusDaMissao1 = "CONCLUIDO";
        } else {
            statusDaMissao1 = "NÃO CONCLUIDO";
        }

        if (idade2>=15){
            statusDaMissao2 = "CONCLUIDO";
        }else if (nivelDaMissao2 =='C' || nivelDaMissao2 =='D' || nivelDaMissao2 =='E') {
            statusDaMissao2 = "CONCLUIDO";
        }

        else
        {
            statusDaMissao2 = "NÃO CONCLUIDO";
        }

        if (idade3>=15){
            statusDaMissao3 = "CONCLUIDO";
        }else if (nivelDaMissao3 =='C' || nivelDaMissao3 =='D' || nivelDaMissao3 =='E') {
            statusDaMissao3 = "CONCLUIDO";
        }else {
            statusDaMissao3 = "NÃO CONCLUIDO";
        }


        System.out.println("Nome: " + nome1 + " idade: "+idade1 + " missão: "+missao1 + " STATUS DA MISSÃO: "+statusDaMissao1+" NV: "+nivelDaMissao1);
        System.out.println("Nome: " + nome2 + " idade: "+idade2 + " missão: "+missao2+ " STATUS DA MISSÃO: "+statusDaMissao2+" NV: "+nivelDaMissao2);
        System.out.println("Nome: " + nome3 + " idade: "+idade3 + " missão: "+missao3+ " STATUS DA MISSÃO: "+statusDaMissao3+" NV: "+nivelDaMissao3);


    }
}
