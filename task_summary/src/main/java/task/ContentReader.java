package task;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class ContentReader {
  public List<String[]> readAllLines(String filePath) throws Exception {
    FileReader filereader = new FileReader(filePath);
    CSVReader reader = new CSVReader(filereader);

    List<String[]> data = new ArrayList<String[]>();

    String[] record = null;

    while ((record = reader.readNext()) != null) {
      data.add(record);
      
    }		
    reader.close();
    return data;
  }
}
