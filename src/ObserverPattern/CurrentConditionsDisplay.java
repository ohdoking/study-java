package ObserverPattern;

public class CurrentConditionsDisplay implements Display, Observer {
	
	private String name;
	
	public CurrentConditionsDisplay(String name) {
		this.name = name;
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		display(temp, humidity, pressure);
	}

	@Override
	public void display(float temp, float humidity, float pressure) {
		System.out.println(name + " : "+temp + "/" + humidity + "/" +pressure);
	}
}
