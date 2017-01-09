
public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName,
			String ssn, double grossSales, double commissionRate,
			double baseSalary) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double earnings() {
		return super.earnings() + baseSalary;
	}
	
	public String toString() {
		return "base salaried " + super.toString() + "\n" +
				"base salary: " + baseSalary;
	}
}
