package intermediario.Ninjas_inicio.REVISAO.Desafio5_2;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor){
        double valorComTaxa = valor *0.99;
        this.saldo += valorComTaxa;
    }
}
