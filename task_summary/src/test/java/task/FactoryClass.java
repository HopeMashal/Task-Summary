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
			double AngleDeg = Double.parseDouble(line[0]);
			double BaseA = Double.parseDouble(line[1]);
			double BaseB = Double.parseDouble(line[2]);
			double Height = Double.parseDouble(line[3]);
			double RadiusA = Double.parseDouble(line[4]);
			double RadiusB = Double.parseDouble(line[5]);
			data[index] = new TestClassForFactory(AngleDeg,BaseA,BaseB,Height,RadiusA,RadiusB);
			index++;
		}
		return data;
	}
}
