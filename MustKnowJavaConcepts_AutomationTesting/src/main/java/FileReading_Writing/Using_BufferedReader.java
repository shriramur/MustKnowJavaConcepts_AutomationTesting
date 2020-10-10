package FileReading_Writing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Using_BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "C:\\Users\\ram\\git\\MustKnowJavaConcepts_AutomationTesting\\MustKnowJavaConcepts_AutomationTesting\\src\\main\\java\\FileReading_Writing\\FileReading_Writing.txt";
		FileReader fileReader = new FileReader(location);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String output = bufferedReader.readLine();//Readline only reads only one line from file(Until /n is encountered), To over come this we need to use looping. Wile(w.readline()!=null)
		System.out.println(output);
		while((bufferedReader.readLine())!=null){
			output = output+bufferedReader.readLine();
		}
		System.out.println(output);
	}

}
