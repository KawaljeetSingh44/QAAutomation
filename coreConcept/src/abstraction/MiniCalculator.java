package abstraction;

public abstract class MiniCalculator {
	public int addition(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public abstract int substraction(int a,int b);

}
