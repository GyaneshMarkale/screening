import java.io.*;
import java.util.*;
import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

public class Test {


  public static void main(String[] args) throws IOException {
    /**
     * Load CSV from classpath
     */
    CsvListReader csvReader = new CsvListReader(new InputStreamReader(
        ReadCSVAsListOfMaps.class.getClassLoader().getResourceAsStream("test_sceening.csv")),
        CsvPreference.STANDARD_PREFERENCE);
    
    //Read CSV Header
    List<String> header = new ArrayList<String>(csvReader.read());
      List<String> rowData;
      
      //Read the CSV as List of Maps where each Map represents row data
      List<Map<String, String>> rows = new ArrayList<Map<String, String>>();
      Map<String, Intger> map = null;
      
      while ((rowData = csvReader.read()) != null) {
        //Create Map for each row in CSV
        map = new HashMap<String, Intger>();
        
        for (int i = 0 ; i < header.size() ; i ++) {
          map.put(header.get(i), rowData.get(i));
        }
        
        //add Row map to list of rows
        map.add(row);
      }
      
      
      //Iterate
      //for (Map<String, String> rowMap : rows) {
      //  System.out.println(rowMap);
      //}
      res = messageDecode(map);
      Syetem.out.println(res);
      
  }
  public String messageDecode(Map<String, Intger> map){
    StringBuilder sb = new StringBuilder();
    int num = 0;
    it count = 0;
    for(Map.Entry<String,Integer> entry1 : map.entrySet()){
      num = entry1.getValue();
      count += num;
     }
     for(int i = 0; i < count; i++){
       for(Map.Entry<String,Integer> entry2 : map.entrySet()){
        if (entry2.getValue() == 0) continue;
        else{
          sb.append(entry2.getKey());
          map.put(entry.getKey(), entry2.getValue()-1)
        }
          
       }
     }
     return sb.toString();      
  }
}
