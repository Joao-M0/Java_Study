import javax.swing.JOptionPane;

public class Impressao {
	public static void print (double valorUm, char operador, double valorDois, double resultado ) {
		System.out.println("O resultado da opera��o "+valorUm+" "+operador+" "+valorDois+" �: "+resultado);
	}
	
	public static void printPane (double valorUm, char operador, double valorDois, double resultado ) {
		JOptionPane.showMessageDialog(null, "O resultado da opera��o "+valorUm+" "+operador+" "+valorDois+" �: "+resultado );
	}
}
