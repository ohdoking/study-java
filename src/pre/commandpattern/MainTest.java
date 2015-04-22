package pre.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		Client client = new Client();
		
		List list = new ArrayList<String>();
		
		list.add("밥");
		list.add("라면");
		
		client.createCommandObject(list);
		
	}
}
