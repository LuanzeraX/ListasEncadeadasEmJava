package exercicio02;

public class Aluno {

	int rm;
	double media;
	
	
	
	
	public Aluno(int rm, double media) {
		super();
		this.rm = rm;
		this.media = media;
	}




	public int getRm() {
		return rm;
	}




	public double getMedia() {
		return media;
	}




	@Override
	public String toString() {
		return "Aluno: |RM: " + rm + " |Media: " + media + "|";
	}
	
}
