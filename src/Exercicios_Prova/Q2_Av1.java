package Exercicios_Prova;
import java.util.Scanner;
import java.util.ArrayList;


public class Q2_Av1 {
	/*Quest�o 2 (BANCO SIMPLES): Desenvolva um Sistema de Controle Banc�rio para correntistas de dado banco, em Java, com as seguintes funcionalidades:
		Inserir nova conta: entrar com numero e saldo.
		Excluir conta: entrar com seu n�mero da conta.
		Efetuar opera��es de d�bito ou cr�dito em contas: escolher o n�mero da conta e valor.
		Consultar saldo da conta: entrar com o seu n�mero da conta.
		Efetuar opera��o de transfer�ncia entre contas: escolher os n�meros das contas e o valor. 
		
		Observa��es:
		- Utilizar arrays.
		- Criar um menu de op��es para que as funcionalidades acima, incluindo a op��o de sa�da pelo usu�rio.*/
	
	static Scanner S = new Scanner(System.in);
	static ArrayList<Conta> ListaContas = new ArrayList<Conta>();
	
	public static void main(String[] args) {
		int op = 0;
		do {
			System.out.println("1 - Inserir Conta");
			System.out.println("2 - Excluir Conta");
			System.out.println("3 - Debitar");
			System.out.println("4 - Creditar");
			System.out.println("5 - Transferir");
			System.out.println("6 - Consultar Contas");
			System.out.println("8 - Sair");
			
			op = S.nextInt();
			switch(op){
				case 1 : InserirConta();break;
				case 2 : ExcluirConta();break;
				case 3 : Debitar();break;
				case 4 : Creditar();break;
				case 5 : Transferir();break;
				case 6 : Consultar();break;
				
				case 8: break;
			}
		}while(op != 8);
	}
	
	private static void InserirConta() {
		int numero;
		double saldo;
		System.out.println("N�mero da conta: ");
		numero = S.nextInt();
		
		System.out.println("Saldo: ");
		saldo = S.nextDouble();
		ListaContas.add(new Conta(numero,saldo));
	}
	
	private static void ExcluirConta() {
		int numero;
		System.out.println("Digite o n�mero da conta a ser exclu�da: ");
		numero = S.nextInt();
		for (int i=0;i<ListaContas.size();i++) {
			if ( numero == ListaContas.get(i).getNumero()){
				ListaContas.remove(i);
			}
		}
		System.out.println("Conta Removida com �xito.");
	}
	
	private static void Debitar() {
		int numero;
		double saldo;
		double valor;
		int index = 0;
		System.out.println("Digite o n�mero da conta para D�bito: ");
		numero = S.nextInt();
		System.out.println("Digite o valor do D�bito");
		valor = S.nextDouble();
		
		for(int i=0;i<ListaContas.size();i++) {
			if(numero == ListaContas.get(i).getNumero()) {
				saldo = ListaContas.get(i).getSaldo();
				ListaContas.get(i).setSaldo(saldo - valor);
				index = i;
			}
		}
		System.out.println("Valor debitado com �xito. Valor da conta: " + ListaContas.get(index).getSaldo());
	}
	
	private static void Creditar() {
		int numero;
		double saldo;
		double valor;
		int index = 0;
		System.out.println("Digite o n�mero da conta para D�bito: ");
		numero = S.nextInt();
		System.out.println("Digite o valor do D�bito");
		valor = S.nextDouble();
		
		for(int i=0;i<ListaContas.size();i++) {
			if(numero == ListaContas.get(i).getNumero()) {
				saldo = ListaContas.get(i).getSaldo();
				ListaContas.get(i).setSaldo(saldo + valor);
				index = i;
			}
		}
		System.out.println("Valor debitado com �xito. Valor da conta: " + ListaContas.get(index).getSaldo());
	}
	
	private static void Transferir() {
		int numero1;
		int numero2;
		double saldo1;
		double saldo2;
		double valor;
		System.out.println("Conta Cedente");
		numero1 = S.nextInt();
		System.out.println("Conta Benefici�rio");
		numero2 = S.nextInt();
		System.out.println("Valor da Transferencia");
		valor = S.nextDouble();
		
		for(int i=0;i<ListaContas.size();i++) {
			if(numero1 == ListaContas.get(i).getNumero()) {
				for(int j=0;j<ListaContas.size();j++) {
					if (numero2 == ListaContas.get(j).getNumero())
					{
						saldo1 = ListaContas.get(i).getSaldo();
						ListaContas.get(i).setSaldo(saldo1 - valor);
						
						saldo2 = ListaContas.get(j).getSaldo();
						ListaContas.get(j).setSaldo(saldo2 + valor);
					}
				}
			}
			
		}
		
	}
	
	private static void Consultar() {
		//int numero;
		//System.out.println("Digite o n�mero da conta para consulta: \n");
		System.out.println("===================== CONTAS ==================== \n");
		//numero = S.nextInt();
		for(int i=0;i <ListaContas.size();i++) {
			System.out.println("\n=====================\n");
			System.out.println("Numero Conta: " + ListaContas.get(i).getNumero());
			System.out.println("Saldo: " + ListaContas.get(i).getSaldo());
			System.out.println("\n=====================\n");
		}
	}
	
	
}
