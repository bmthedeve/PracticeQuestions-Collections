package practiceQuestions;
import java.util.*;
import java.util.stream.Collectors;
public class MainCitizenAddress {
	
	static HashMap<Long,Citizen> citizensMap = new HashMap<>();
	
	public static void main(String[] args) {
		citizensMap.put(123456789123L, new Citizen("A",21,88888888,"@@@",new Address(31,"Kal","Che","TN",600001)));
		citizensMap.put(123546789123L, new Citizen("B",81,77777777,"###",new Address(41,"Lak","Mum","MP",600761)));
		citizensMap.put(123466789123L, new Citizen("C",51,66666666,"***",new Address(51,"Alk","Hyd","AP",600351)));
		citizensMap.put(123487889123L, new Citizen("D",31,55555555,"&&&",new Address(61,"Ghy","Coi","TN",604301)));
		citizensMap.put(198456789123L, new Citizen("E",71,44444444,"%%%",new Address(71,"Hyg","Luc","WB",633301)));
		
		aadharAscending(citizensMap);
//		System.out.println(citizensWithSameAddress(citizensMap));
		System.out.println(citizensInDescOrderAge(citizensMap));
	}
	
	public static void aadharAscending(HashMap<Long,Citizen> hm) {
		hm.keySet().stream().sorted().forEach(System.out::println);
	}
	
	//return if both citizens has same state
//	public static void citizensWithSameAddress(HashMap<Long,Citizen> hm) {
//		hm.values().stream().map(o->o.getAddress().getState()).
		
		//using AnyMatch()
//		hm.values().stream().forEach(o->(map(o->o.getAddress().getState()).anyMatch(hm.values().stream().map(o->o.getAddress().getState()))));
		
//		List<Citizen> l2 = hm.values().stream().filter((o1,o2)->(o1.getAddress().getState()).equals(o2.getAddress().getState())).collect(Collectors.toList());
		
//	}
	
	public static List<Citizen> citizensInDescOrderAge(HashMap<Long,Citizen> hm) {
		return hm.values().stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).collect(Collectors.toList());
	}
}
