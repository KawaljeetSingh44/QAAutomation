package coreConcepts;

import org.junit.Test;


	




public class Practice extends Assignments {
	public  Practice() {
		System.out.println("clear all cache");
		
	}
	
public static void main(String[] args) {
		
		int fac =	factorial(5);
		System.out.println(fac);
		
		
		int sum = SumRect(5);
		System.out.println(sum);

			
		}



	
	
	
	
//	public void  sum(int a, int b) {
//		System.out.println(a + b); 
//	}
//	
//	public void sum(int a,int b,int c) {
//		System.out.println(a + b + c);
//	}
//	public void sum(int a,int b,int c,int d) {
//		System.out.println(a + b + c + d);
//	}
//	
	

	static void sum(int ...arr) {
		int result = 0;
		for(int a:arr) {
			result += a;
		}
		System.out.println(result);
		
		
	}
	
	@Test
	public  void sum1() {
       sum(4,5);
       sum(4,5,6);
       sum(5,6,7,4,5,6,4,3,2,3,3);
		
	}
			
		
		
	
public static int factorial(int n){
	if(n>=1) {
return n * factorial(n-1)	;	
	}
	else {
	return 1;
		
}
	
	

		

}


public  void pattern(int n){
    for (int i=5;i>=n;i--){
    	for(int j=0;j<i;j++) {
    		System.out.print("*");
        
    }
    	System.out.println();
    	
        
    
}
}

@Test
public void test() {
	pattern(1);
}

	
static int 	SumRect(int n) {
	if(n==1) {
		return 1;
	}
	return n + SumRect(n-1);
}

@Test
public void sumofarray() {
	int arr[] = {22,33,55,66,44 };
	int sum =1;

	for( int i=0;i<5;i++) {
		sum = sum + arr[i];
		
	}
	System.out.println(sum);
	
	
}
@Test
public void diff() {
	for( int i=4;i<=40;i=i+3) {
		System.out.println("series of numbers is" +i);
	}
}


public void diff(int SN,int CD,int TotalCount) {
	for( int i=SN;i<=TotalCount;i=i+CD) {
		System.out.println("series of numbers is" +i);
	}
	
	
}
@Test
public void diff_Test() {
	diff(4,3,40);
	
	
}









	
}
