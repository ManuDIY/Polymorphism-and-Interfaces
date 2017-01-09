
public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String ssn,
					double grossSales, double commissionRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	public String toString() {
		return "commission employee: " + super.toString() + "\n" +
				"gross sales: " + grossSales + "\n" +
				"commission rate: " + commissionRate;
	}

}
