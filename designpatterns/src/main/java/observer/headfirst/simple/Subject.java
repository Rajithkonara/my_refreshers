package observer.headfirst.simple;

public interface Subject {

  void registerObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObservers();

}
