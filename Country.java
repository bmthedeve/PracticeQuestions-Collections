package practiceQuestions;

import java.util.HashMap;

public class Country {
	private HashMap<String,Integer> hm;
	public Country() {
		hm = new HashMap<>();
		hm.put("TN", 45638);
		hm.put("MP", 55638);
		hm.put("AP", 47538);
		hm.put("WB", 49838);
		hm.put("MA", 45698);
	}

	public HashMap<String, Integer> getHm() {
		return hm;
	}

	public void setHm(HashMap<String,Integer> hm) {
		this.hm = hm;
	}

}
