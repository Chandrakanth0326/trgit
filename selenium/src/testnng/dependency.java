package testnng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependency 
{
	@Test
	public void compose()
	{
		Reporter.log("compose", true);
	}
	@Test(dependsOnMethods="compose")
	public void sentitems()
	{
		Reporter.log("sent items", true);
		Assert.fail();
	}
	@Test(dependsOnMethods="sentitems")
	public void hash()
	{
		Reporter.log("trash", true);
	}
}
