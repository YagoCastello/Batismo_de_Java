package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.desafio555555555;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    // 6. Implemente o método depositar com taxa de 1% (conforme solicitado)
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            double taxa = valor * 0.01; // 1% de taxa (conforme exemplo no desafio)
            double valorLiquido = valor - taxa;
            saldo += valorLiquido; // Adiciona o valor líquido ao saldo
            System.out.println("Depósito de R$" + valor + " realizado na conta poupança.");
            System.out.println("Taxa de R$" + taxa + " aplicada. Valor creditado: R$" + valorLiquido);
        }
    }
}
