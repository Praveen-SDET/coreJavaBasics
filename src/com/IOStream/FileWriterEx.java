package com.IOStream;
import java.io.FileWriter;
public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String data = "This is the data in the output file";
				try {
					//creates a filewriter
					FileWriter output = new FileWriter("D:\\SDET_WS\\CoreJawaBasics\\src\\com\\IOStream\\Output.ext");
					// writes the string to the file
					output.write(data);
					output.flush();
					output.close();
				}catch(Exception e) {
					e.getStackTrace();
					System.out.println(e.toString());
					
				}
	}

}
