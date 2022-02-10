package coreConcepts;

import org.junit.Test;

public class ConditionalStatements {
	
	public void performAddition(int a,int b) {
		System.out.println("A value :" +a);
		System.out.println("B value :" +b);
		
		if(a==b)
		{
			int sum = a+b;
			System.out.println(" sum of two numbers" +sum);
		}
	}
	
	@Test
	public void performAddition_Test() {
		performAddition(44,44);
		performAddition(44,24);
	}
	
	public void performAddition_ifelse(int a,int b) {
		System.out.println("A value : " +a);
		System.out.println("B value :" +b);
		if(a==b)
		{
			int sum = (a+b);
			System.out.println("sum of two numbers" +sum);
		}
		else if(a>b)
		{
			int diff = (a-b);
			System.out.println("difference of two numbers" +diff);
		}
		else if(a<b) {
			int prod = (a*b);
			System.out.println("product of two numbers" +prod);
		}
		
		
	}
	@Test
	public void performTest() {
		performAddition_ifelse(22,22);
		performAddition_ifelse(26,55);
		
	}
	
	public void performAddition_elseif(int a,int b) {
		System.out.println("A value:" + a);
		System.out.println("B value :" + b);
		if(a==b) {
			int sum = (a+b);
			System.out.println("sum of two numbers" +sum);
		}
		
		else if(a>b) {
			int diff = (a-b);
			System.out.println("diff of two numbers" +diff);
		}
		else if(a<b) {
			int prod = (a*b);
			System.out.println("product of two numbers" +prod);
			
		}
	}
	
	@Test
	public void performAddition_elseifTest() {
		performAddition_elseif(55,66);
		performAddition_elseif(535,55);
		
	}
	public void logicalOperator(int a,int b) {
		System.out.println("A value :" +a);
		System.out.println("A value :" +b);
		
		if((a>10) && (b>10)) {
			if(a==b)
			{
				int sum = (a + b);
				System.out.println("sum of two numbers" +sum);
				
			}
			else if(a>b) {
				int diff = (a-b);
				System.out.println("diff of two numbers" +diff);
			}
			else if(a<b) {
				int prod = (a*b);
				System.out.println("product of two numbers" +prod);
				
			}
			
			
		}
		else {
			System.out.println("both a & b");
		}
		
		
	}
	
	@Test
	public void logicalOperator_test() {
		logicalOperator(4,7);
		logicalOperator(54,7);
		logicalOperator(8,90);
		logicalOperator(88,88);
		logicalOperator(84,77);
		logicalOperator(66,88);
		
	}
	
	public void multipleDecisions(char grade) {
		switch(grade) {
		case 'A' :{
			System.out.println("student passed in destinction" +grade);
			break;
		}
		case 'B' :{
			System.out.println("student passed in first class" +grade);
			break;

		}
		case 'C' :{
			System.out.println("student passed in second class" +grade);
			break;

		}
		case 'D' :{
			System.out.println("student passed in third class" +grade);
			break;

		}
		case 'E' :{
			System.out.println("student passed " +grade);
			break;

		}
		case 'F' :{
			System.out.println("student failed" +grade);
			break;

		}
		default :{
			System.out.println("grade is not valid" +grade);
			
		}
		
		}
		}
@Test
	public void multiplications_Test() {
		multipleDecisions('B');
		multipleDecisions('C');
		multipleDecisions('R');
		multipleDecisions('U');
		multipleDecisions('A');
		multipleDecisions('D');
		multipleDecisions('E');
		multipleDecisions('F');
		multipleDecisions('G');
		multipleDecisions('D');
		multipleDecisions('A');

	}


	
	
	
	
	

}
