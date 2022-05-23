package test02AgainOOP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadSymptomDataFromFile implements ISymptomReader {
	// field
	private String filepath;
	private List<String> symptomList;
	private Map<String, Integer> symptomData;

	// constructor
	public ReadSymptomDataFromFile(String filepath, List<String> symptomList, Map<String, Integer> symptomData) {
		this.filepath = filepath;
		this.symptomList = symptomList;
		this.symptomData = symptomData;
	}

	// getter
	public String getFilepath() {
		return filepath;
	}

	public List<String> getSymptomList() {
		return symptomList;
	}

	public Map<String, Integer> getSymptomData() {
		return symptomData;
	}

	// setter
	public void setFILE_PATH(String filepath) {
		this.filepath = filepath;
	}

	public void setGetSymptomList(List<String> symptomList) {
		this.symptomList = symptomList;
	}

	public void setGetSymptomData(Map<String, Integer> symptomData) {
		this.symptomData = symptomData;
	}

	public List<String> listFromFile(String filepath) throws IOException {
		List<String> result;
		try (Stream<String> lines = Files.lines(Paths.get(filepath))) {
			result = lines.collect(Collectors.toList());
		}
		return result;

	}

	public Map<String, Integer> listToMap (List<String> SymptomList){
			  Map<String, Integer> map = SymptomList.stream()
			    .collect(Collectors.toMap(map?::getSymptoms,Function.identity()));
			  return map;
				}
}