package intermediario.Ninjas_inicio.Enumsss;

public class Main  {
    public static void main(String[] args) {
       Missoes missao1 = new Missoes("Resgatar cachorros",RankDeMissoes.D);
       Missoes missao2 = new Missoes("Derrotar Zabuza Momichi ",RankDeMissoes.A);

        missao1.exibirDetalhes();
        System.out.println(" ");
        missao2.exibirDetalhes();
    }
}
