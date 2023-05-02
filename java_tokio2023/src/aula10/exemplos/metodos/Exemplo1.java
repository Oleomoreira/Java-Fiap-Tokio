package aula10.exemplos.metodos;

	 
	import java.util.Scanner;

	public class Exemplo1 {
		
		//metodos sem retorno e sem parametros/argumentos
		
		static void saudacao() {
			System.out.println("Bem vindo ao programa");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("digite o seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println("digite sua idade: ");
			int idade = sc.nextInt();
			
			System.out.printf("ola, %s! Voce tem %d anos.", nome, idade );
			
			if (idade >= 18) {
				System.out.println(" Voce eh maior de idade");
			} else {
				System.out.println(" Voce eh menor de idade");
			}


		}

		public static void main(String[] args) {
			
			saudacao();
			

		}

	}

}
