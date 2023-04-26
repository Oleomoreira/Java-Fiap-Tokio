package logica.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {
		
		String str = "FIAP PAULISTA";
		
		int tamanhostr = str.length();
		System.out.println("Tamanho da str:" + tamanhostr);
		
		for(int i = 0; i < tamanhostr; i++) {
			System.out.println(str.charAt(i));
			
			
			
		}
	}

}

//como definir a classe length?

//Ela percorre cada char(posição) da String
//LENGTH = TAMANHO


