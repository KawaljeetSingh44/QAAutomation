package apiTesting;

public class SequentialExecution 
{
public static void main(String[] args) {
	Printer p1 = new Printer(10,"Education");
	Printer p2 = new Printer(15,"Job");
	Printer p3 = new Printer(10,"medical");
	Printer p4 = new Printer(20,"property");
	


	p1.printDocuments();
	p2.printDocuments();
	p3.printDocuments();
	p4.printDocuments();
}
	
}

class Printer
{   int count;
String category;
	Printer(int docCount,String category)
	{
		count = docCount;
		this.category = category;
	}
	
	public void printDocuments() {
		for(int i=1;i<=count;i++) {
			
		
		System.out.println("print document"+category+ +i);
		}
	}
}
