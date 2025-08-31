package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.desafio555555555;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    // 4. Implemente o método depositar (conforme solicitado)
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // Adiciona o valor diretamente ao saldo
            System.out.println("Depósito de R$" + valor + " realizado na conta corrente.");
        }
    }
}

