package coreConcept;

public class MiniCalculator implements ArithmeticOperations {
	
	public void display() {
		System.out.println("welcome to casio");
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int addition(int[] numbers) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	

}
