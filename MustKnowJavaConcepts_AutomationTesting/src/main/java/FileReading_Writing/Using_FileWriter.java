package FileReading_Writing;

import java.io.FileWriter;
import java.io.IOException;

public class Using_FileWriter {
	
	public static void main(String[] args) throws IOException{
		//This will directly interact with files which is costly operation and which will affect the performance
		//1. Location
		//2. Content
		String location = "UsingFileWriter.txt";
		String content = "We are writing this using FileWriter class in java";
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
		
	}

}
