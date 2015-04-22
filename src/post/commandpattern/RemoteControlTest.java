package post.commandpattern;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		
		SimpleRemoteControl src = new SimpleRemoteControl();
		GarageDoor g = new GarageDoor();
		Light l = new Light();
		
		GarageDoorOpenCommand gc = new GarageDoorOpenCommand(g);
		LightOnCommand lc = new LightOnCommand(l);
		
		src.setCommand(gc);
		src.buttonWasPressed();
		src.setCommand(lc);
		src.buttonWasPressed();
	}
}
