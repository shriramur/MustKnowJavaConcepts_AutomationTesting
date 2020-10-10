package FileReading_Writing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Using_Path {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "UsingPath.txt";
		String content = "We are writing this using Path nio class in java";
		byte[] byteArray = content.getBytes();
		
		Path path = Paths.get(location);
		Files.write(path,byteArray);
	}

}
