package aula10.exemplos.metodos;

import java.util.Scanner;

public class exemplo2 {
	

	// Metodos sem retor com argumentos/parametros
	static void saudacaoComArg(String nome, int idade) {
		
		System.out.println(nome);
		System.out.println(idade);

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nomeDig = sc.nextLine();
		

		System.out.println("Digite sua idade");
		int idadeDig = sc.nextInt();
		
	
		saudacaoComArg(nomeDig , idadeDig);
		
		sc.close();
			
	}

}
