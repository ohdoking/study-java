package ObserverPattern;

public class WeatherDataTest {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		data.registerObserver(new CurrentConditionsDisplay("currentCondition"));
		data.registerObserver(new StatisticsDisplay("statisticsDisplay"));
		data.registerObserver(new ForecastDisplay("forecastDisplay"));
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("============");
			
			data.measurementsChanged();
		}
	}
}
