public class Adder {
	
	public int add(int num1, int num2) {
		return num1 + num1;
	}
	
	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public int add(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}
	
	public int add(double num1, double num2) {
		return (int) (num1 + num2);
	}

}
