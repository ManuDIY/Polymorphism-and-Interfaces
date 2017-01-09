
public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName,
			String ssn, double wage, double hours) {
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double earnings() {
		if (hours > 0 && hours <= 40) {
			return wage * hours;
		} else {
			return wage * 40 + (hours - 40) * wage * 1.5;
		}
	}
	
	public String toString() {
		return "hourly employee:" + super.toString() + "\n" +
			"hourly wage: " + wage + "\n" +
			"hours worked: " + hours;
	}
}
