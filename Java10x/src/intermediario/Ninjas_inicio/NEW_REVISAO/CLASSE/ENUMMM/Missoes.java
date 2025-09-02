package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.ENUMMM;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;


    public void exibirDetalhes(){
        System.out.println("Miss/ão: " + nome + " Rank: " + rank + " Descri/ç/ão: "+rank.getDescricao()+" Dificuldade: "+rank.getDificuldade());
    }



    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
