package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements SubJect{
	
	WeatherStation ws = new WeatherStation();

	ArrayList<Observer> list = new ArrayList<Observer>();
	
	public float getTemperature() {
		return ws.getTemperature();
	}

	public float getHumidity() {
		return ws.getHumidity();
	}

	public float getPressure() {
		return ws.getPressure();
	}

	public void measurementsChanged() {
		// 3초씩 Station 의 변화 상태를 체크한다.
		
		// 변화했다면?
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		list.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		
		for(Observer observer : list) {
			observer.update(temp, humidity, pressure);
		}
	}
	
}
