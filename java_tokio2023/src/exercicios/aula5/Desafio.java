package exercicios.aula5;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int idadeEmDias = sc.nextInt();
		
		int anos = (int) idadeEmDias / 365;
		System.out.println("Idade em nos:" + anos);
		
		int restoDias = idadeEmDias % 365;
		System.out.println(restoDias);
		
		int meses = (int) restoDias / 30;
		System.out.println("Idade em meses " + meses);
		
		int dias = restoDias %restoDias % 30;
			System.out.println("Idade em dias: " + dias);

	}

}
