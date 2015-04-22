package pre.commandpattern;

import java.util.List;

public class Invoker {
	
	Command command;
	
	public void setCommand(Command command){
		this.command = command;
		
		invoke(); // command.execute(list);
	}
	
	private void invoke() {
		command.execute();
	}
}
