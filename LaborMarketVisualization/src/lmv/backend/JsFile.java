package lmv.backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile.readData("file.csv");
		ReadFile.readBaseTable("base.xls");
		JsFile jsf = new JsFile();
		try {
			jsf.outputJs("2006", "Unemployment Rate");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void outputJs(String year, String var) throws IOException{
		List<String[]> data = ReadFile.getData();
		StringBuilder sb = new StringBuilder();
		sb.append(" var array = [ ['Lat', 'Long', 'Name', '"+var+"'], ");
		for(int i = 1; i < data.size(); i++){
			String[] row = data.get(i);
			if(year.equals(row[0])){
				
				if(row[1].contains("Average"))
					continue;
				sb.append(" [ ");
				String msa = row[1].substring(1)+","+row[2].substring(0,row[2].lastIndexOf(" "));
//				System.out.println(msa);
				
				List<String> latLon = ReadFile.getMap().get(msa);
				if(latLon == null)
					continue;
				sb.append(latLon.get(0)+","+latLon.get(1)+"," +row[1].substring(1)+"," + row[ReadFile.getIndex().get(var) + 1]);
				sb.append(" ], ");
			}
			else if(Integer.valueOf(year) < Integer.valueOf(row[0]))
				break;
			else
				continue;
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(" ]; ");
		System.out.println(sb.toString());
		
		File file =new File("data.js");
		if(!file.exists())
			file.createNewFile();
		 FileWriter fileWritter = new FileWriter(file.getName());
         BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
         bufferWritter.write(sb.toString());
         bufferWritter.flush();
         bufferWritter.close();
	}

}
