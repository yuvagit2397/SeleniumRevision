package seleniumInterViewPreparation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
    int retryCount=5;
    int count=1;
	@Override
	public boolean retry(ITestResult result) {
		if (count<=retryCount) {
			count++;
			return true;
		}
		return false;
	}
	
	

}
