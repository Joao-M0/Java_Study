import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo("Ret�ngulo", 4, 8);
		Triangulo triangulo = new Triangulo("Tri�ngulo", 15, 22);
		Circulo circulo = new Circulo("C�rculo", 12);
		
		// Adiciona as figuras geometricas em uma ArrayList
		ArrayList<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<FiguraGeometrica>();
		listaFigurasGeometricas.add(retangulo);
		listaFigurasGeometricas.add(triangulo);
		listaFigurasGeometricas.add(circulo);
		
		// Mostra dados das figuras geometricas
		for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
			System.out.println("\n"+figuraGeometrica.getDescricao());
			System.out.printf("Area da figura: %.2f \n", figuraGeometrica.getArea());
		}
	}
}
