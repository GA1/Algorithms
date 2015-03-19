import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;


public class TxtFileProcessing 
{
	static final String UTF8_BOM = "\uFEFF";
	
	static public int countLinesInFile(String inputFileName) throws IOException {
		return readLinesFromFile(inputFileName).size();
	}
	
	public static ArrayList<String> readLinesFromFile(String inputFileName) throws IOException {			
		ArrayList<String> lines = new ArrayList<String>();		
		boolean isFirstLine = true;
		
		try {			
			File fileDir = new File(inputFileName);	 
			BufferedReader in = new BufferedReader( new InputStreamReader(new FileInputStream(fileDir), "UTF8") );	 
			String str;
			
			while ((str = in.readLine()) != null) {
				if( isFirstLine ){					
					str = removeUTF8BOMifNeeded(str);
					isFirstLine = false;
				}				
				lines.add(str);
			} 
            in.close();
	    } 
	    catch (Exception e) {	
	    	System.out.println(e.getMessage());	    
	    }
		
		return lines;
	}	
		// UTF8 Files contain invisible (in notepad) sign which has to be eliminated
		private static String removeUTF8BOMifNeeded(String s) {			
	        if (s.startsWith(UTF8_BOM))	        
	            s = s.substring(1);	        
	        return s;
	    }
		
	public static void saveLinesToFile(ArrayList<String> linesToSave, String outputFileName) {			
		try{
			File fileDir = new File(outputFileName);			
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir), "UTF8"));
			
			for(String str: linesToSave){
				writer.append(str).append("\r\n");;
			}			 
			writer.flush();
			writer.close();			 
	    } 
	    catch (Exception e){
	    	System.out.println(e.getMessage());	  
	    } 
	}	
}
