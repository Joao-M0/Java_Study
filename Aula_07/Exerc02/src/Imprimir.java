
public class Imprimir {
	public static Professor lerProfessor() {
		String nome = Leitor.lerString("Informe seu nome completo: ");
		String cpf = Leitor.lerString("Informe seu CPF: ");
		String matricula = Leitor.lerString("Informe sua matr�cula: ");
		double salario = Leitor.lerDouble("Informe seu sal�rio: ", "Valor inv�lido", 0, Double.MAX_VALUE);
		
		Professor prof = new Professor(nome, cpf, matricula, salario);
		
		return prof;
	}
	
	public static Diretor lerDiretor( ) {
		String nome = Leitor.lerString("Informe seu nome completo: ");
		String cpf = Leitor.lerString("Informe seu CPF: ");
		String matricula = Leitor.lerString("Informe sua matr�cula: ");
		double salario = Leitor.lerDouble("Informe seu sal�rio: ", "Valor inv�lido", 0, Double.MAX_VALUE);
		
		Diretor dir = new Diretor(nome, cpf, matricula, salario);
		
		return dir;
	}
}
