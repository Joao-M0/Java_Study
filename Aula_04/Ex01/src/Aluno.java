
public class Aluno {
	//Caracter�sticas
	String nome;
	double notaUm;
	double notaDois;
	//A��es
	public double getMedia() {
		return (notaUm + notaDois) / 2;
	}
	public boolean isAprovoado() {
		return getMedia() > 7.0; //return true - false
	}
}
