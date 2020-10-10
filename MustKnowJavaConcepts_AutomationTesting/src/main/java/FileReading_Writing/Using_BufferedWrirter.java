package FileReading_Writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Using_BufferedWrirter {

	public static void main(String[] args) throws IOException {
		String location = "UsingBufferedWriter.txt";
		String content = "We are writing this using FileWriter class in java";
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("We are writing this using BufferedWriter class in java");
		bufferedWriter.close();

	}

}
