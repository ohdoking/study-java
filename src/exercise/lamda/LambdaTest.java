package exercise.lamda;

import java.util.Arrays;
import java.util.List;


public class LambdaTest {
	
	public static void main(String[] args) {
		
		Button button = new Button();
	/*	button.setOnClickListener(new OnClickListener(){
			public void onClick(){
				System.out.println("눌러짐");
			}
		});*/
		
		
		button.setOnClickListener(() -> {
				System.out.println("눌러짐");
		});
		button.performClick();
		
		
		Display d = new Display();
		d.showSomething(button, 
				(b,z) -> {
					System.out.println(z);
					return b != null;
				}
				, () -> {
						System.out.println(button.name);
				});
		
		
		Arrays.asList(1,2,3,4,5,6).forEach(i -> {
			System.out.println(i);
		});;
		
		
	}

}

class Display{
	public void showSomething(Button b,Predicate p, Something s){
		if(p.testIsNotNull(b,"test")){
			s.show();
		}
	}
}

interface Predicate{
	public boolean testIsNotNull(Button s,String d);
}

interface Something {
	void show();
}

class Button{
	public String name = "1버튼";
	public OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener){
		this.listener = listener;
	}
	
	public void performClick(){
		listener.onClick();
	}
}
//interface Method가 하나여야 Lambda 사용 가능
interface OnClickListener{
	public void onClick();
}