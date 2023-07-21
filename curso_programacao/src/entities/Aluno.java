package entities;

public class Aluno {
	
	public String name;
	public String surname;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double media() {
		return nota1 + nota2 + nota3;
	}

	public String toString() {
		return "NOTA FINAL = "
				+ media();
			
}
	public double recuperacao() {
		return 60.00 - media();
		
	}
	

}