package coreConcepts;

import org.junit.Test;

public class Inherit //extends Practice
{
	
	public Practice rc = new Practice();
	
	@Test
	public void difference(){
		rc.diff();
		rc.diff(2,4,30);
		rc.sumofarray();
		rc.findeven();
		
	}

}
