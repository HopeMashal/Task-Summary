package task;

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
			String AngleDeg = line[0];
			String BaseA = line[1]; 
			String BaseB = line[2]; 
			String Height = line[3]; 
			String RadiusA = line[4]; 
			String RadiusB = line[5];
			data[index] = new TestClassForFactory(AngleDeg,BaseA,BaseB,Height,RadiusA,RadiusB);
			index++;
		}
		return data;
	}
}
