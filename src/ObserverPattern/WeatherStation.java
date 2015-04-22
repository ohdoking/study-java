package ObserverPattern;

import java.util.Random;

public class WeatherStation{
	
	Random r = new Random(System.currentTimeMillis());
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherStation() {
		// TODO Auto-generated constructor stub
		
		temperature = r.nextFloat() * 100;
		humidity = r.nextFloat();
		humidity = r.nextFloat() * 20;
		
	}
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	
}
