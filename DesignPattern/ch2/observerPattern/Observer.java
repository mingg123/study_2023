package ch2.observerPattern;

public interface Observer {
  public void update(float temp, float humidity, float pressure);
}
