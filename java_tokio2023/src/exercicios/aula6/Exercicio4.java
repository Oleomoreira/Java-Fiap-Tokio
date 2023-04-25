package exercicios.aula6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para 'A':");
		int a = sc.nextInt();
		
		System.out.println("Digite um valor para 'B':");
		int b = sc.nextInt();
		
		if (a % b ==0 || b % a ==0) {
			System.out.println("São multiplos");
			
			}else {
				System.out.println("Não são multiplos");
			}
		}
	

}
