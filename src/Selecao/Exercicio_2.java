package Selecao;

/*		Escreva um programa que leia as notas das duas avalia��es normais e a nota da avalia��o optativa.
Caso o aluno n�o tenha feito a optativa deve ser fornecido o valor �1. Calcular a m�dia do semestre
considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avalia��es.
Escrever a m�dia e mensagens que indiquem se o aluno foi aprovado, reprovado ou est� em exame,
de acordo com as informa��es abaixo:
Aprovado : media >= 6.0
Reprovado: media < 3.0
Exame : media >= 3.0 e < 6.0
*
*/
import java.util.Scanner;

public class Exercicio_2 {
	static Scanner S = new Scanner(System.in);
	private static double Av1 = 0, Av2 = 0 , Av3 = 0, Media;
	
	//calcula m�dia
	public static double Calcularmedia(double av1, double av2, double av3) {
		double media = 0;
		if(av3 > av1) {
			media = (av2 + av3)/2;
		}
		else if(av3 > av2) {
			media = (av1 + av3)/2;
		}
		else {
			media = (av1 + av2)/2;
		}	
		return media;
	}
	//Rotina principal
	public static void main(String[] args){
		System.out.println("Primeira Avalia��o: ");
			Av1 = S.nextDouble();
		System.out.println("Segunda Avalia��o:");
			Av2 = S.nextDouble();
		System.out.println("Avalia��o Optativa:");
			Av3 = S.nextDouble();
			if(Av3 == -1) {
				Av3 = 0;
			}
			Media = Calcularmedia(Av1,Av2,Av3);
		System.out.println("M�dia: " + Media);
		if(Media >= 6.0)
				System.out.println("Aluno Aprovado");
		else if(Media >= 3.0 && Media < 6.0)
				System.out.println("Aluno em Exame");
		else if(Media < 3) 
				System.out.println("Aluno Reprovado");
	}
}
