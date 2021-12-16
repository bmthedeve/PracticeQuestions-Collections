package practiceQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainBasket {
	static ArrayList<Basket> al = new ArrayList<>();
	public static void main(String[] args) {
		
		al.add(new Basket(123433,2));
		al.add(new Basket(634676,3));
		al.add(new Basket(526435,4));
		al.add(new Basket(989774,5));
		al.add(new Basket(535635,6));
		
		System.out.println(getHighestBasketQuantity(al));
		System.out.println(getLowestBasketQuantity(al));
		System.out.println(rangeOfBaskets(al, 2, 8));
		System.out.println(totalQtyOfAllBaskets(al));
	}
	
	public static int getHighestBasketQuantity(ArrayList<Basket> list) {
		return list.stream().max((o1,o2)->o1.getQty()-o2.getQty()).get().getQty();
	}
	
	public static int getLowestBasketQuantity(ArrayList<Basket> list) {
		return list.stream().min((o1,o2)->o1.getQty()-o2.getQty()).get().getQty();
	}
	
	public static ArrayList<Basket> rangeOfBaskets(ArrayList<Basket> list, int startingRange, int endingRange){
		List<Basket> l= list.stream().filter(o->o.getQty()>=startingRange && o.getQty()<=endingRange).collect(Collectors.toList());
		ArrayList<Basket> al2 = new ArrayList<Basket>(l);
		return al2;
	}
	
	public static int totalQtyOfAllBaskets(ArrayList<Basket> list) {
		return list.stream().collect(Collectors.summingInt(Basket::getQty));
	}
}
