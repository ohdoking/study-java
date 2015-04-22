package post.commandpattern;

public class GarageDoorOpenCommand implements Command{

	GarageDoor g;
	
	public GarageDoorOpenCommand(GarageDoor g) {
		this.g = g;
	}
	@Override
	public void execute() {
		g.down();
	}

}
