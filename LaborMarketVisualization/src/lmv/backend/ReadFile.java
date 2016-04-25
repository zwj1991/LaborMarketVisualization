package lmv.backend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadFile {

	private static List<String[]> data;
	private static List<String> years;
	private static Map<String,Integer> index;
	public static List<String> getYears() {
		return years; 
	}
	public static List<String> getVars() {
		return vars;
	}
	private static List<String> vars;
	
	public static List<String[]> getData() {
		return data;
	}
	
	private static Map<String,List<String>> map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReadFile().readBaseTable("Base.xls");
	}
	
	public static void readBaseTable(String file){
		map = new HashMap<String,List<String>>(); 
		jxl.Workbook readwb = null;
		try    		  
        {   
            InputStream instream = new FileInputStream(file);   
            readwb = Workbook.getWorkbook(instream);     
            
            Sheet readsheet = readwb.getSheet(0);    
            int rsColumns = readsheet.getColumns();    
            int rsRows = readsheet.getRows();     
  
            for (int i = 1; i < rsRows; i++)     
            {     
                String msa = readsheet.getCell(0, i).getContents().replaceAll("[^a-zA-z,]", " ").replaceAll("  ", " ");
                List<String> latLon = new ArrayList<String>();
                String lat = readsheet.getCell(3, i).getContents();
                String lon = readsheet.getCell(4, i).getContents();
                latLon.add(lat);
                latLon.add(lon);
            	if(!map.containsKey(msa)){
            		map.put(msa, latLon);
            	}
//              System.out.println(msa+" " + lat+" "+lon);
  
            }
        }catch (Exception e) {
				// TODO: handle exception
            	e.printStackTrace();
        }   
  
	}
	
	public static Map<String, List<String>> getMap() {
		return map;
	}
	public static void readData(File file){
		data = new ArrayList<String[]>(); 
		try {  	            
			 	BufferedReader reader = new BufferedReader(new FileReader(file)); 
	            String line = null;  
	            while((line=reader.readLine())!=null){  
	                String[] item = line.split(",");  
	                data.add(item);
//	                System.out.println(line);  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	    }
		index = new HashMap<String,Integer>();
		vars = new ArrayList<String>();
		years = new ArrayList<String>();
		for(int i = 2; i < data.get(0).length; i++){
			vars.add(data.get(0)[i]);
			index.put(data.get(0)[i], i);
		}
		
		String breakPoint = data.get(data.size() - 1)[0];
		for(int i = 1; i < data.size(); i++){
			if(!years.contains(data.get(i)[0])){
				years.add(data.get(i)[0]);				
			}
			else if (data.get(i)[0].equals(breakPoint))
				break;
		}
		
//		for(String v : vars)
//			System.out.println(v);
//		for(String y : years)
//			System.out.println(y);
	}
	public static Map<String, Integer> getIndex() {
		return index;
	}

}
