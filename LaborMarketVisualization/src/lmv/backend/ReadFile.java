package lmv.backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read("file.csv");
	}
	
	public static List<String[]> read(String file){
		List<String[]> data = new ArrayList<String[]>(); 
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
	return data; 			
	}

}
