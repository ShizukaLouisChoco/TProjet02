package test02AgainOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter implements ISymptomOrganizer {
	// field
	Map<String, Integer> symptomData;

	// constructor
	public AnalyticsCounter(Map<String, Integer> symptomData) {
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

	// counter
	@Override
	public void symptomCounter(Map<String, Integer> symptomMap){
		Map<String,Integer> unSortedMap = new HashMap<String, Integer>;
		unSortedMap = (HashMap<String, Integer>)symptomMap;
		for (String word : symptomMap) {
			if (!word.isEmpty()) {
				if (unSortedMap.containsKey(word)) {
					int count = unSortedMap.get(word) + 1;
					unSortedMap.put(word, count);
				} else {
					unSortedMap.put(word, 1);
				}
			}
		}
	}

	// SortMap();
	public void SymptomSorter(Map<String, Integer> symptomMap) {

		List<String> list = new ArrayList<>(map.keySet());list.sort(String::compareTo);
	}

}
