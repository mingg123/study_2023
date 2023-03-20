package ch2.observerPattern;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMesurements(80, 65, 30.4f);
    weatherData.setMesurements(82, 70, 29.2f);
  }
}
