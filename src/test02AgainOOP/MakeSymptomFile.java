package test02AgainOOP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class MakeSymptomFile implements ISymptomFileMaker {
	// field
	private String filepath;

	// constructor
	public MakeSymptomFile(String filepath) {
		this.filepath = filepath;
	}

	public void symptomFileMaker(Map<String, Integer> symptomData) {

		try {
			FileWriter writer = new FileWriter(filepath);
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(writer));
			for (Map.Entry<String, Integer> entry : symptomData.entrySet()) {
				printWriter.println(entry.getKey() + ":" + entry.getValue());
			}
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
