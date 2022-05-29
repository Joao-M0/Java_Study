import java.util.Scanner;
import javax.swing.JOptionPane;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		//Calcular fatorial de um n�mero
		int num = lerInt("Informe um n�mero: ");
		int fatorial = Matem�tica.fatorial(num);
		printPane(num, fatorial);
		
		//Recebe dois n�meros e retorna o maior
		int valorUm = lerInt("Informe o primeiro n�mero: ");
		int valorDois = lerInt("Informe o segundo n�mero: ");
		int maiorNumero = Matem�tica.maior(valorUm, valorDois);
		printPane(valorUm, valorDois, maiorNumero);
		
		//Recebe um n�mero e retorna se ele Par = true ou Par = false
		int numero = lerInt("Informe um n�mero: ");
		boolean numeroPar = Matem�tica.par(numero);
		printPane(numero, numeroPar);
		
		//Recebe um n�mero e retorna se ele � um n�mero Primo ou n�o;
		int n = lerInt("Digite um n�mero: ");
		boolean numeroPrimo = Matem�tica.numeroPrimo(n);
		print(n, numeroPrimo);
		
	}
	
	public static int lerInt(String msgUsuario) {
		System.out.println(msgUsuario);
		return lerInt();	
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static void print(int numero, boolean numeroPrimo) {
		System.out.println("O n�mero "+numero+" � um n�mero Primo? "+numeroPrimo);
	}
	
	public static void printPane(int numero, boolean numeroPar) {
		JOptionPane.showMessageDialog(null, "O n�mero "+numero+" � um n�mero Par? "+numeroPar);
	}
	
	public static void printPane(int valorUm, int valorDoism, int maiorNumero) {
		JOptionPane.showMessageDialog(null, "O maior n�mero �: "+maiorNumero);
	}
	
	public static void printPane(int num, int fatorial) {
		JOptionPane.showMessageDialog(null, "O fatorial de "+num+"! �: "+fatorial);
	}
}
