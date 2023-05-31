public class Main {
    public static void main(String[] args) {

        Cliente yumy = new Cliente();
        yumy.setNome("Yumy");


        Conta cc = new ContaCorrente(yumy);
        Conta poupanca = new ContaPoupanca(yumy);


        cc.depositar(50);
        cc.transferir(10, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}