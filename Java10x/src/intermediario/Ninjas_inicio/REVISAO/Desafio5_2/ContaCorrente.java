package intermediario.Ninjas_inicio.REVISAO.Desafio5_2;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }


    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }
}
