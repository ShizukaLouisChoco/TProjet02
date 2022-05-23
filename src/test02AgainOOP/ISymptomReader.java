package test02AgainOOP;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ISymptomReader {

	public List<String> listFromFile(String filepath) throws IOException;
	public Map<String, Integer> listToMap (List<String> SymptomList);
	
}
