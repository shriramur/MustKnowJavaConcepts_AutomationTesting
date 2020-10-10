package FileReading_Writing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Using_FileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "UsingFileOutputStream.txt";
		String content = "We are writing this using FileOutputStream class in java";
		byte[] byteArray = content.getBytes();
		FileOutputStream fos = new FileOutputStream(location);
		fos.write(byteArray);
		fos.close();
	}

}
