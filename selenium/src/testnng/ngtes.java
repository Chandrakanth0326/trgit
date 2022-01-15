package testnng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ngtes 
{
	@Test(invocationCount=3)
	public void test1()
	{
		Reporter.log("hello", true);
	}
	@Test(priority=-1)
	public void test2() 
	{
		Reporter.log("ramnagar", true);
	}

}
