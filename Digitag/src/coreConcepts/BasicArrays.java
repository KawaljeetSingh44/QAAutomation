package coreConcepts;

import org.junit.Test;

public class BasicArrays {
	public int rollNum = 22;
	
	@Test
	public void fixedIntegerArray() {
		int numbers[] = {22,23,24,25,26,27,28,29,32,34,35,38};
		int len = numbers.length;
		System.out.println("length of array" +len);
		int value = numbers[0];
		numbers[1] = 55;
		for(int i=0;i<len;i++) {
			System.out.println("elements before" +numbers[i]);
		}
	}
	
	@Test
	public void dynamicArray() {
		int numbers[] = new int[20];
		int len = numbers.length;
		System.out.println("length of the array" +len);
		
		for(int i=0;i<len;i++) {
			System.out.println("elements before" +numbers[i]);
		}
		for(int i=0;i<len;i++) {
			numbers[i] = 22+i;
			System.out.println("elements after" +numbers[i]);
		}
	}
	@Test
	public void fixedIntegerArray2() {
		String name[] = {"ramesh","suresh","ram","kawal"};
		int len = name.length;
		System.out.println("length of array" +len);
		String value = name[0];
		name[1] = "sushma";
		for(int i=0;i<len;i++) {
			System.out.println("elements before" +name[i]);
		}
	}
	
	@Test
	public void fixedIntegerArray3() {
		int numbers[] = {22,23,24,25,26,27,28,29,32,34,35,38};
		int len = numbers.length;
		System.out.println("length of array" +len);
		int value = numbers[0];
		numbers[1] = 55;
		for(int i=0;i<=len;i++) {
			System.out.println("elements before" +numbers[i]);
		}
	}
	
	@Test
	public void dynamicArray2() {
		String name[] = new String[20];
		int len = name.length;
		System.out.println("length of the array" +len);
	
		
		for(int i=0;i<len;i++) {
	   name[i] = "ram" +i;
			
			System.out.println("elements after" +name[i]);
			
		}
		
	}
	
	@Test
	public  void marks() {
		int marks[] = {55,66,77,88,44};
		int total =1;

		int percentage=1;
		for(int i=0;i<5;i++) {
			
			 total = total +marks[i];
			 
		

		}
		  percentage = (total*500/ 100);

		 System.out.println(percentage);



		
	}
	


		
	


	
	
	
	
	
	
	

}
