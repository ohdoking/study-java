package pre.commandpattern;

import java.util.List;

public class Reciever {
	List<String> orders;
	
	public Reciever(List<String> orders) {
		this.orders = orders;
	}

	public void action1() {
		System.out.println("action1 밥");
	}

	public void action2() {
		System.out.println("action2 국물");
		
	}

	public void action3() {
		System.out.println("action3 반찬");
		
	}

	public void action4() {
		System.out.println("action4 라면");
		
	}

}
