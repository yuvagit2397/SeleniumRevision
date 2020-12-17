package yuPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelEx {
@Test
public void method1() {

Assert.assertEquals(true, false);
System.out.println("method1");
}
@Test
public void method2() {
System.out.println("method2");
}
@Test
public void method3() {
System.out.println("method3");
}
}
