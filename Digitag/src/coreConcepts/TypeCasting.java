package coreConcepts;

import org.junit.Test;

public class TypeCasting {
	
	public void implicitTypeCasting() {
		int number = 25;
		double bigNumber = number;
		System.out.println(number);
		System.out.println(bigNumber);
	}
	
	
	public void ExplicitTypeCasting() {
		
		
		double bigNumber = 22.25;
		int number = (int)bigNumber;
		System.out.println(number);
		System.out.println(bigNumber);
		
	}
	
	@Test
	public void stringtoIntConversion() {
		String num = "1234";
		System.out.println(num+num);
		int newnum = Integer.parseInt(num);
		System.out.println(newnum+newnum);
		String s2 = Integer.toString(newnum);
		System.out.println(s2+s2);
		
		
	}
	
	
	
	

}
