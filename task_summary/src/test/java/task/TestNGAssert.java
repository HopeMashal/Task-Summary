package task;

import org.testng.Assert;

public class TestNGAssert {
  public static void TestNGZeroMsg(){
    Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
  }

  public static void TestNGStringMsg(){
    Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
  }

  public static void TestNGNegativeMsg(double ExArea, double AcArea){
    Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
  }
}
