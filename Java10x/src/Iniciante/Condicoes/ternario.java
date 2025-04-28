package Iniciante.Condicoes;

public class ternario {
    public static void main(String[] args) {
        int idade = 14;
        String alistamento = (idade>=18) ? "Vai servir" : "Não vai servir ainda";
        System.out.println(alistamento);

        String sinal = "vermelho";
        String carro = (sinal=="verde") ? "Pode seguir dirigindo" : "Pare o carro";
        System.out.println(carro);
    }
}
