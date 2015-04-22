package ObserverPattern;

public interface SubJect {
	public void removeObserver(Observer observer);
	void registerObserver(Observer observer);
	public void notifyObservers();
	
	
}
