package task;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

public class FactoryClass {

	@Parameters({"CSVpath"})
  @Factory
	public Object[] factoryMethod(String CSVpath) throws Exception {
    ContentReader reader = new ContentReader();
		List<String[]> lines = reader.readAllLines(CSVpath);
		lines.remove(0);
		Object[] data = new Object[lines.size()];
		int index = 0;
		for(String[] line : lines) {
			double AngleDeg, BaseA, BaseB, Height, RadiusA, RadiusB;
			ArrayList<Double> myArrayDouble = new ArrayList<Double>();
			for(int i=0;i<line.length;i++){
				try {
					myArrayDouble.add(Double.parseDouble(line[i]));
				} catch (Exception e) {
					System.out.println("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
					myArrayDouble.add(0.00001);
				}
			}
			AngleDeg = myArrayDouble.get(0);
			BaseA = myArrayDouble.get(1); 
			BaseB = myArrayDouble.get(2); 
			Height = myArrayDouble.get(3); 
			RadiusA = myArrayDouble.get(4); 
			RadiusB = myArrayDouble.get(5);
			data[index] = new TestClassForFactory(AngleDeg,BaseA,BaseB,Height,RadiusA,RadiusB);
			index++;
		}
		return data;
	}
}
