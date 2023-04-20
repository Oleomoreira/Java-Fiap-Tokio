package exercicios.aula6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num = sc.nextDouble();
		
		if (num %2 == 0) {
			System.out.println("O número digitado é par");
		}else {
			System.out.println("o número digitado é impar");
		}
		

	}

}
