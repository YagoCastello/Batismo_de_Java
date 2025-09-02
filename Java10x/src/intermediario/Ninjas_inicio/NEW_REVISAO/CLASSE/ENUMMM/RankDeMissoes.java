package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.ENUMMM;

import intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.GetterSettersss.NewAburames;

public enum RankDeMissoes {
    D("Baixo",2),
    C("Moderado",3),
    B("Confortavel",4),
    A("Dificil",5),
    S("Altissimo",12);



    private String descricao;
    private int dificuldade;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;


    }
}
