package pre.commandpattern;

import java.util.List;

public class Client {
	
	Invoker invoker = new Invoker();
	Reciever reciever;
	
	public void createCommandObject(List<String> list){
		reciever = new Reciever(list);
		
		Command command = new Command() {
			@Override
			public void execute() {
				reciever.action1();
				reciever.action3();
			}
		};
		
		invoker.setCommand(command);
	}
}

