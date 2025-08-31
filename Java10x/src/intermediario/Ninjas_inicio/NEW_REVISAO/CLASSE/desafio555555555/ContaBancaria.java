package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.desafio555555555;

public abstract class ContaBancaria implements Conta {

    double saldo; // Atributo saldo (conforme solicitado)

    // Construtor para inicializar o saldo (conforme solicitado)
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // 3. Implemente o método consultarSaldo() (conforme solicitado)
    @Override
    public double consultarSaldo() {
        return saldo;
    }

    // 4. Deixe o método depositar(double valor) abstrato (conforme solicitado)
    @Override
    public abstract void depositar(double valor);

}
