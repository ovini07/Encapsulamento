package Capsula;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria conta = new ContaBancaria(100000.00);
		
		System.out.println("--------Saldo da conta:--------");
		System.out.println(conta.getSaldo() + " reais");

		//Depósitos
		conta.depositar (500);
		conta.depositar (1000);

		// mostrar saldo após 2 depósitos 
		System.out.println("--------Saldo do deposito:--------");
		System.out.println(conta.getSaldo()+" reais");

		//Saque
		conta.sacar (1500);

		// mostrar o saque 
		System.out.println("--------Saldo da conta:--------");
		System.out.println(conta.getSaldo()+" reais");	}

}
