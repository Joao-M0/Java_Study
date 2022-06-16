
public class Enumeradores {
	public static void main(String[] args) {
		Sexo sx = Sexo.MASCULINO;
		System.out.println(sx.name());
		// Retorna uma String, com o mesmo nome da
		//declara��o, no caso 'MASCULINO'
		System.out.println(sx.ordinal()); 
		// Retorna um inteiro de acordo 
		//com a posi��o da declara��o, no caso � 0;
		System.out.println(sx.valor);
		
		//M�todo values.
		Turno [] turnos = Turno.values();
		for (Turno trn : turnos) {
			System.out.println("Descri��o: "+trn.name());
			System.out.println("Descri��o: "+trn.ordinal());
		}
	}
}

enum Turno {
	MATUTINO, VESPERTINO, NOTURNO
}

enum Sexo {
	MASCULINO(1), //o argumento passo � atribuido a valor
	FEMININO(2); //enum sexo tem duas inst�ncias constantes.
	
	public int valor; //atributo do enum Sexo
	private Sexo (int valor) {//construtor private do enum Sexo
		this.valor = valor; //atribui��o do valor
	}
}

