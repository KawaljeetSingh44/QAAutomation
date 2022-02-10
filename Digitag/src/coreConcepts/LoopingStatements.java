package coreConcepts;

import org.junit.Test;

public class LoopingStatements {
	
	@Test
	public void applycolor() {
		for(int i=1;i<=50;i=i+1) {
			System.out.println("apply color to step" +i);
			
		}
	}
	
	public void applyRedColorToOddSteps() {
		for(int i=1;i<=50;i=i+2) {
			System.out.println("apply color to odd steps" +i);
		}
	}
	
	public void applyRedColorToEvenSteps() {
		for(int i=2;i<=50;i=i+2) {
			System.out.println("apply green color to even steps" +i);
		}
			}
	
	public static void printEvenNumbers(int range) {
		for(int i=1;i<=range;i++) {
			int rem = i % 2;
			if(rem==0) {
				System.out.println("the number " +i + "even");
			}
			
		}
		
		
	}
	@Test
	public void printevenNumbers_test() {
		printEvenNumbers(40);
		
	}
	public static void printOddNumbers(int range) {
		for(int i=1;i<=range;i++) {
			int rem = i % 2;
			if(!(rem==0)) {
				System.out.println("the number " +i + "odd");
			}
		
			
		}
	
	


	
	}
	@Test
	public void printoddNumbers_test() {
		
		
		printOddNumbers(43);
		
	}
	
	public boolean findStudent(int count,int rollNum) {
		boolean result = false;
		for(int r=1;r<=count;r++) {
			if(r==rollNum) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	@Test
	public void findStudent_test() {
		boolean output = findStudent(50,32);
		if(output)
		{
			System.out.println("student found");
		}
		else {
		System.out.println("student not found");
		}
		
	}
	public void printEvenNumberOfYourChoice(int howmany) {
		int start = 1;
		
		
		do
		{
			if((start % 2)==0) {
				System.out.println("even numbers" +start);
			
			}
			start++;
		}
		while(start<howmany);
		System.out.println("ending numbers" +start);
	}
	

	
@Test
public void printEvenNumberOfYourChoice_test() {
	
	printEvenNumberOfYourChoice(50);
	
	
	
}
	
	
}
