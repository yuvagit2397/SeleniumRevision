package seleniumInterViewPreparation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class RerunFailedTestCase {
	@Test(retryAnalyzer=Retry.class)
	public  void m1() {
		
		Assert.assertEquals(true, false);

	}
	@Test(retryAnalyzer=Retry.class)
public void m2() {
		
		Assert.assertEquals(true, true);

}
}
