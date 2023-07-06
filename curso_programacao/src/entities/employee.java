package entities;

public class employee {

	
	public String name;
	public String surname;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += percentage * grossSalary / 100.00;
		
		
	}
	
	public String toString() {
		return name 
		+ " "
		+ surname
		+ ", $ "
		+ netSalary();
		}
	
	
}