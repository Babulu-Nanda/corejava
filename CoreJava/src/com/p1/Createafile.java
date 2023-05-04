package com.p1;

import java.io.*;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;
import java.util.Scanner;

public class Createafile {
	public static void main(String[] abc) throws IOException {
		
		
		

		File file = new File("d:/sampleFile.txt");
		
			
		BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("d:/sampleFile.txt"));
		bufferedWriter.write("ssss");
		bufferedWriter.newLine();
	
		bufferedWriter.write("Data is Updated"); // to write some data
		bufferedWriter.close();
		

	}
}
