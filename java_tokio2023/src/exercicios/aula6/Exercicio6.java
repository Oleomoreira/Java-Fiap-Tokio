package exercicios.aula6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		int i = sc.nextInt();
		
		if(i<16) {
			System.out.println("Voto proibido!");
			}else if (i>=16 && i <18) {
			System.out.println("Voto opcional!");
			}else if (i>=18 && i <70) {
			System.out.println("Voto obrigatório!");
			}else if (i >=70) {
			System.out.println("Voto opcional");
			}
		

	}

}
