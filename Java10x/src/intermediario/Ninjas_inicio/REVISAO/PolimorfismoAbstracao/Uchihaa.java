package intermediario.Ninjas_inicio.REVISAO.PolimorfismoAbstracao;

public class Uchihaa extends Ninja{

    @Override
    public void habilidadeEspecial(){
        System.out.println("habilidade UCHIHA");
    }
    public void estrategiaDeCombate(){
        System.out.println(nome+" invocou uma cobra gigante!");
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Me chamo "+nome+" e essa é a minha estratégia de combate UCHIHAAAAAAA!!");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if(qi>150){
            System.out.println("Seu Q.I é: "+qi+" e você é um gênio UCHIHAAAAAAA");
        } else if (qi>=130) {
            System.out.println("Seu Q.I é: "+qi+" e você é um ninja promissor UCHIHAAAAAAA");
        }else{
            System.out.println("Seu Q.I é: "+qi+" e você precisa treinar mais suas estratégias UCHIHAAAAAAA");
        }
}}
