package exercicios.aula5;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double vproduto = sc.nextDouble();
		
		System.out.println("Digite o valor que o cliente pagou: ");
		double vpago = sc.nextDouble();
		
		double troco = vproduto - vpago;
		
		System.out.println("Dar" + troco + "de troco.");
	}
	

}
