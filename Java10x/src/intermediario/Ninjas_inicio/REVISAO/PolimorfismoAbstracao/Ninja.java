package intermediario.Ninjas_inicio.REVISAO.PolimorfismoAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    int idade;
    String aldeia;


    @Override
    public String toString(){
        return "Meu nome é: "+nome+" e eu sou da : " + aldeia;
    }



    public void habilidadeEspecial(){
        System.out.println("Habilidade especial generica!");
    }
    public abstract void estrategiaDeCombate();


    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Estrategiiii");
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Me chamo "+nome+" e essa é a minha estratégia de combate!!");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if(qi>150){
            System.out.println("Seu Q.I é: "+qi+" e você é um gênio");
        } else if (qi>=130) {
            System.out.println("Seu Q.I é: "+qi+" e você é um ninja promissor");
        }else{
            System.out.println("Seu Q.I é: "+qi+" e você precisa treinar mais suas estratégias");
        }


    }
}
