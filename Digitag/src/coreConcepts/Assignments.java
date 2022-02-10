package coreConcepts;

import org.junit.Test;

public class Assignments {
	public void addition(int a,int b){
		if(a==b) {
			int sum = a + b;
			System.out.println(sum);
		}
		else {
			int diff = a - b;
			System.out.println(diff);
		}
	}
	
	@Test
	public void add_test() {
		addition(10,10);
		addition(30,7);
	}
	
	public void oddeven(int n) {
	
		if(n%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("not even");
		}
				
	}
    
	@Test
	public void even_test() {
		oddeven(6);
		oddeven(5);
	}
	public void range(int range,int n) {
		for( int i=0;i<=range;i++) {
			if(i==n) {
			System.out.println("we find the number" +i);
			break;
			
			
		}
			
	}
	
	}
	@Test
	public void range_test() {
		range(50,8);
	}
	
	public void findnum(int n) {
		int a[] = {5,7,9,88,77};
		for(int i:a) {
			
			if(i==n) {
				System.out.println("number is" +i);
			}
			i++;
			
		}
	
		
	}
	@Test
	public void findnum_test(){
		findnum(77);
		
		
	}
	
	public void findstudent(String n) {
		String a[] = {"ramesh","suresh","ram","kawal"};
		for(String i:a) {
			
			if(i==n) {
				System.out.println("Studentname is" +i);
			}
		
			
		}
	
		
	}
	@Test
	public void findstudent_test(){
		findstudent("kawal");
		
		
	}
	
	public void findstud(int range,int rollnum) {
		for( int i=0;i<range;i++) {
			if(rollnum==i) {
				System.out.println("student rollnumber is in the range");
			}
			
		}
		
	}
	public void printeven(int range) {
		int count = 0;
		for(int i=0;i<range;i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void printeventest() {
		printeven(50);
	}
	
	@Test
	public void findeven() {
		int count = 0;
		int a[] = {5,7,9,88,77};
		for(int i:a) {
			
			if(i%2==0) {
				count++;
				
			}
			
			
		}
		System.out.println(count);
	
		
	}
	

	
	
	
	
	
	
}
