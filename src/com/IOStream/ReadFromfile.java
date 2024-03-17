package com.IOStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromfile {

	public static void main(String[] args) {
		char [] array = new char[100];
		
		try {
			// Creates a readere using the filereader
			FileReader input = new FileReader("D:\\SDET_WS\\CoreJawaBasics\\src\\com\\IOStream\\ReadFromfile.java");
			
			// Reads characters
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			//close the reader
			input.close();
		}catch (IOException e) {
			e.getStackTrace();
			System.out.println(e.toString());
		}

	}

}
