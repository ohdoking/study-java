package ObserverPattern;

public class StatisticsDisplay implements Display, Observer{
	private String name;
	
	public StatisticsDisplay(String name) {
		// TODO Auto-generated constructor stub
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
