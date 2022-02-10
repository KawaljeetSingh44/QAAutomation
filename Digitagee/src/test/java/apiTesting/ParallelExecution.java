package apiTesting;

public class ParallelExecution {
	
	public static  void main(String[] args) {
		PrinterOne p1 = new PrinterOne(20,"Education");
		PrinterOne p2 = new PrinterOne(20,"job");
		PrinterOne p3 = new PrinterOne(20,"medical");
		PrinterOne p4 = new PrinterOne(20,"property");
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		Thread t4 = new Thread(p4);
		t1.start();t2.start();t3.start();t4.start();


	}

}
class PrinterOne extends Thread
{   int count;
String category;
	PrinterOne(int docCount,String category)
	{
		count = docCount;
		this.category = category;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=count;i++) {
			
		
		System.out.println("print document"+category+ +i);
		}
	}
}
