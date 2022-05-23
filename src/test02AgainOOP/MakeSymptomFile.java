package test02AgainOOP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class MakeSymptomFile implements ISymptomFileMaker {
	// field
	private Map<String, Integer> symptomData;

	// constructor
	public MakeSymptomFile(Map<String, Integer> symptomData) {
		this.symptomData = symptomData;
	}
	// getter
	public Map<String, Integer> getSymptomData() {
		return symptomData;
	}

	// setter
	public void setSymptomData(Map<String, Integer> symptomData) {
		this.symptomData = symptomData;
	}

	public void symptomFileMaker(Map<String, Integer> symptomData) {
		try {
			FileWriter writer = new FileWriter("/Users/shizukatanigawa/Downloads/resultout.txt");
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
