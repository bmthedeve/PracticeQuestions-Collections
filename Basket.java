package practiceQuestions;

import java.util.ArrayList;

public class Basket {
	private long manufactureNo;
	private int qty;
	private ArrayList<Basket> al;
	
	public Basket() {
		al = new ArrayList<>();
		al.add(new Basket(123433,2));
		al.add(new Basket(634676,3));
		al.add(new Basket(526435,4));
		al.add(new Basket(989774,5));
		al.add(new Basket(535635,6));
	}
	
	public Basket(long manufactureNo, int qty) {
		super();
		this.manufactureNo = manufactureNo;
		this.qty = qty;
	}
	
	public long getManufactureNo() {
		return manufactureNo;
	}
	public void setManufactureNo(long manufactureNo) {
		this.manufactureNo = manufactureNo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public ArrayList<Basket> getAl() {
		return al;
	}

	public void setAl(ArrayList<Basket> al) {
		this.al = al;
	}

	@Override
	public String toString() {
		return "Basket [manufactureNo=" + manufactureNo + ", qty=" + qty + "]";
	}
	
}
