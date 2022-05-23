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
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		
	String filepath = "ressource/symptoms.txt";
	List<String> symptomList = null;
	Map<String, Integer> symptomMap = null;
	
	ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(filepath,symptomList, symptomMap);
	read.listFromFile(filepath);
		
}

// ListFromFile


//MapFromList
private static Map<String, Integer> convertListToMap(List<String> list) {
  Map<String, Integer> map = list.stream()
    .collect(Collectors.toMap(SymptomsModel::getSymptoms,Function.identity()));
  return map;
	}
}

