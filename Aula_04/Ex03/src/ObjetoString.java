
public class ObjetoString {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		/*Exemplos*/
		
//		charAt()
		String linguagem = "Java";
		char c = linguagem.charAt(2);//retorna 'v'
		
//		endsWith()
		String texto = "Linguagem de Programa��o Java";
		boolean b = texto.endsWith("Java");//retorna true
		
//		equals()
		String nome = "Mario";
		boolean d = nome.equals("mario");//ser� falso, pois come�a com M mai�sculo
		d = nome.equals("Mario");//retorna true, pois s�o iguais
		
//		length()
		String palavra = "Java";
		int tam = nome.length();//retorna o tamanho da String: 4
		
//		startsWith
		String cor = "Marrom";
		boolean e = cor.startsWith("Ma");//retorna true

	}
	

	
	/*Principais m�todos da API String*/
	
	/*M�todo*/
	public char charAt(int index) {
		return 0;
//		Retorna o char que se encontra na posi��o que tiver sido passado como argumento.
	}
	
	public boolean endsWith(String suffix) {
		return false;
//		Testa se uma String termina com um determinado sufixo que passado como argumento.
	}
	
	public boolean equals(Object anObject) {
		return false;
//		Retorna true se a String que for passa seja exatamente igual.
	}
	
	public int length() {
		return 0;
//		Retonra o tamanho da String.
	}
	
	public boolean startsWith(String prefix) {
		return false;
//		Testa se uma String come�a com determinado prefixo que foi passado como argumento.
	}
	
	public String toUpperCase() {
		return null;
//		Retorna uma NOVA String em caixa alta.
	}
	
	public String toLowerCase() {
		return null;
//		Retorna uma nova String em caixa baixa.
	}
}
