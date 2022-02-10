package coreConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.Test;

public class MyLists {
	
	@Test
	public void arrayList_Integer() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int len = numbers.size();
		System.out.println("length of the array" +len);
		numbers.add(1);
		numbers.add(12);
		numbers.add(256);
		numbers.add(17);
		numbers.add(162);
		numbers.add(22);
		numbers.add(111);
		numbers.add(122);
		System.out.println("length of the array after adding elements" +numbers.size());
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		numbers.add(2,16);
		System.out.println("after insertion, size" +numbers.size());
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i) + " ,");
		
		}
		System.out.println();
		numbers.remove(1);
		System.out.println("after removing, size" +numbers.size());
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i) + " ,");
		
		}
		Collections.sort(numbers);
		System.out.println();
		System.out.println("after sorting, size" +numbers.size());
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i) + " ,");
		}
		
		Collections.reverse(numbers);
		System.out.println();
		System.out.println("after reverse sorting, size" +numbers.size());
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i) + " ,");
		}
	}
		
		public void myLinkedList_integer() {
	
	LinkedList<Integer> numbers = new LinkedList<Integer>();
	int len = numbers.size();
	System.out.println("length of the array" +len);
	numbers.add(1);
	numbers.add(12);
	numbers.add(256);
	numbers.add(17);
	numbers.add(162);
	numbers.add(22);
	numbers.add(111);
	numbers.add(122);
	System.out.println("length of the array after adding elements" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.println(numbers.get(i));
	}
	numbers.add(2,16);
	System.out.println("after insertion, size" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.print(numbers.get(i) + " ,");
	
	}
	System.out.println();
	numbers.remove(1);
	System.out.println("after removing, size" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.print(numbers.get(i) + " ,");
	
	}
	Collections.sort(numbers);
	System.out.println();
	System.out.println("after sorting, size" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.print(numbers.get(i) + " ,");
	}
	
	Collections.reverse(numbers);
	System.out.println();
	System.out.println("after reverse sorting, size" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.print(numbers.get(i) + " ,");
	}
	
	
}
@Test
		public void myLinkedList_String() {
			
	LinkedList<String> numbers = new LinkedList<String>();
	int len = numbers.size();
	System.out.println("length of the array" +len);
	numbers.add("ram");
	numbers.add("shyam");
	numbers.add("raghav");
	numbers.add("dev");
	numbers.add("shubham");
	numbers.add("himaanshu");
	numbers.add("kawal");
	numbers.add("nandni");
	System.out.println("length of the array after adding elements" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.println(numbers.get(i));
	}
	numbers.add(2,"shivam");
	System.out.println("after insertion, size" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.print(numbers.get(i) + " ,");
	
	}
	System.out.println();
	numbers.remove(1);
	System.out.println("after removing, size" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.print(numbers.get(i) + " ,");
	
	}
	Collections.sort(numbers);
	System.out.println();
	System.out.println("after sorting, size" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.print(numbers.get(i) + " ,");
	}
	
	Collections.reverse(numbers);
	System.out.println();
	System.out.println("after reverse sorting, size" +numbers.size());
	for(int i=0;i<numbers.size();i++) {
		System.out.print(numbers.get(i) + " ,");
	}
	
	
}
@Test
public void linkedsort() {
	LinkedList<Integer> number = new LinkedList<Integer>();
	number.add(5);
	number.add(6);
	number.add(3);
	number.add(9);
	number.add(7);
	number.add(33);
	number.add(33);
	number.add(20);
	number.add(25);
	
for( int i=0;i<number.size();i++) {
	System.out.println("list is" +number.get(i));
	
}

for(int i=0;i<number.size();i++) {
	for( int j=1;j<number.size();j++) {
		if(number.get(j-1)>number.get(j)) {
			int a = number.get(j);
			int b = number.get(j-1);
		
			number.set(j-1, a);
			number.set(j,b);
			
			
			
		}
		
	}
	System.out.println("after sorting" +number.get(i));
	
}

	
	
}
@Test
public void linkedcolor() {
	LinkedList<String> color = new LinkedList<String>();

	color.add("red");
	color.add("green");
	color.add("blue");
	color.add("yellow");
	color.add("brown");
	
	for(int i=0;i<color.size();i++) {
		for(int j=1;j<=1;j++) {
			System.out.println("color for floor" + +i +color.get(i));
	}
	}

	
}







}
