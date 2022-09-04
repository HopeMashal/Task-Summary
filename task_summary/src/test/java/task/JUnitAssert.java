package task;

import org.junit.Assert;

public class JUnitAssert {
  public static void JUnitZeroMsg(){
    Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
  }

  public static void JUnitStringMsg(){
    Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
  }

  public static void JUnitNegativeMsg(double ExArea, double AcArea){
    Assert.assertEquals("CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
  }
}
