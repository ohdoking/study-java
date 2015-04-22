package pre.templatepattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBerverageWithHook{

	@Override
	void brew() {
		System.out.println("brew Coffee");
	}

	@Override
	void addCondiments() {
		System.out.println("add milk,sugar");
	}
	
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}
		else{
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("do you want to add milk and sugar in coffee? (y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer  = in.readLine();
		} catch (IOException e) {
			System.out.println("IO error");
		}
		
		if(answer == null){
			return "no";
		}
		return answer;
	}

	
}
