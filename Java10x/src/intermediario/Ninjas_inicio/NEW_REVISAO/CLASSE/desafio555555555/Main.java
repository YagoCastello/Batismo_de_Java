package intermediario.Ninjas_inicio.NEW_REVISAO.CLASSE.desafio555555555;

public class Main {

    public static void main(String[] args) {
        // Demonstração do sistema
        ContaCorrente corrente = new ContaCorrente(1000);
        ContaPoupanca poupanca = new ContaPoupanca(500);

        System.out.println("Saldo inicial corrente: R$" + corrente.consultarSaldo());
        System.out.println("Saldo inicial poupança: R$" + poupanca.consultarSaldo());

        corrente.depositar(200);
        poupanca.depositar(100);

        System.out.println("Saldo após depósitos:");
        System.out.println("Corrente: R$" + corrente.consultarSaldo());
        System.out.println("Poupança: R$" + poupanca.consultarSaldo());
    }
}
