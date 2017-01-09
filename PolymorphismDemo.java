public class PolymorphismDemo {

	public static void main(String[] args) {		
		
		// POLYMORPHISM VIA METHOD OVERLOADING - EARLY or COMPILE-TIME BINDING
		
		int[] numbers = {10, 15, 20, 25, 30};
		
		Adder adder = new Adder();
		adder.add(10, 15);
		adder.add(10, 15, 20);
		adder.add(numbers);
		
		
		// POLYMORPHISM VIA INHERITANCE - LATE or RUN-TIME BINDING
		
		Employee[] emps = new Employee[5];
		
		emps[0] = new HourlyEmployee("John1", "Doe1", "123-45-6789", 15.00, 40);
		emps[1] = new SalariedEmployee("John2", "Doe2", "123-45-6789", 1000.00);
		emps[2] = new SalariedEmployee("John3", "Doe3", "123-45-7789", 1500.00);
		emps[3] = new CommissionEmployee("John4", "Doe4", "120-45-6789", 2500, 0.15);
		emps[4] = new BasePlusCommissionEmployee("John5", "Doe5", "123-45-6789", 3000, 0.15, 1500.00);
		
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].earnings());
		}
		
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] instanceof BasePlusCommissionEmployee) {
				((BasePlusCommissionEmployee) emps[i]).getCommissionRate();
			}
		}
		
		// POLYMORPHISM VIA INTERFACES - LATE or RUN-TIME BINDING
		
		Priority[] p = new Priority[5];
		p[0] = new Task(1, 3, "Go to mall");
		p[1] = new SomeClass();
		p[2] = new SomeClass();
		p[3] = new Task(2,4,"Prepare for exam");
		p[4] = new Task(3,2,"Work on project");
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getPriority());
		}
	}

}
