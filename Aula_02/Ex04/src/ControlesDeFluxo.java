
public class ControlesDeFluxo {
	public static void main(String[] args) {
		/*
		 * Lista de controles de fluxo com exemplos.
		 */
		
		//Sele��o
		int num1 = 10, num2 = 10;
		if(num1 == num2);
		System.out.println("Iguais");
		if(num1 != num2);
		System.out.println("Diferentes");
		
		//Escolha
		String comida = "4";
		switch(comida) {
		case "1":
			System.out.println("Pizza");
		case "2":
			System.out.println("Lasanha");
		case "3":
			System.out.println("Hamb�rguer");
		case "4":
			System.out.println("Strogonoff");
		}
		
		//Repeti��o
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		//Repeti��o
		int num3 = 0;
		while (num3 < 5) {
			System.out.println(++num3);
		}
	}
	
	
}
