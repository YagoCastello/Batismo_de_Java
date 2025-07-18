package intermediario.Ninjas_inicio.REVISAO.Desafio5;

public abstract class ContaBancaria implements Conta{
    protected double saldo;

    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    @Override
    public double consultarSaldo(){
        return saldo;
    }

    public abstract void depositar(double valor);
}
