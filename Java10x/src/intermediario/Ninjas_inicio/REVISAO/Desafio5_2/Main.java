package intermediario.Ninjas_inicio.REVISAO.Desafio5_2;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(100.0);
        conta1.depositar(50.0);
        System.out.println("Saldo Conta Corrente: " + conta1.consultarSaldo());

        Conta conta2 = new ContaPoupanca(100.0);
        conta2.depositar(50.0);
        System.out.println("Saldo Conta Poupança: " + conta2.consultarSaldo());
    }
}
