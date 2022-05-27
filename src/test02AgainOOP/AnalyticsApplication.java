package test02AgainOOP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnalyticsApplication {
	public static void main(String[] args) throws IOException {

		String filepath = "ressource/symptoms.txt";
		String writeFilepath ="ressource/output.txt";
		ISympotmReader read = new ReadSymptomDataFromFile(filepath);
		List<String> symptomList = read.GetSymptoms();
		ProcessSymptoms processSymptoms = new ProcessSymptoms();
		Map<String, Integer> symptomMap = processSymptoms.listToMap(symptomList) ;
		MakeSymptomFile makeSymptomFile = new MakeSymptomFile(writeFilepath);
		makeSymptomFile.symptomFileMaker(symptomMap);
		

	}
}
