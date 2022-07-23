
public class Main {

	public static void main(String[] args) {
		
		Cliente jackson = new Cliente();
		jackson.setNome("Jackson");
		
		
		
		Conta cc = new ContaCorrente(jackson);
		cc.depositar(200);
		
		Conta poupanca = new ContaPoupanca(jackson);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
