import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		double salario;
		
		try {//delimita a zona de perigo
			//na leitura pode ocorrer um exception
			System.out.println("Informe um sal�rio: ");
			salario = new Scanner(System.in).nextDouble();
			
		}catch (InputMismatchException ex) {
			//caso o dado n�o seja um double a seguinte mensagem ser� mostrada
			System.out.println("Ops! O valor informado � inv�lido.");
			ex.printStackTrace();
		}
		System.out.println("Finalizando o programa normalmente.");
	}
}
