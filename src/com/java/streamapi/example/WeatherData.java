package com.java.streamapi.example;

public class WeatherData {

	private String loc;
	private double temperature;
	private double humidity;
	private double windspeed;
	
	public WeatherData(String loc, double temperature, double humidity, double windspeed) {
		super();
		this.loc = loc;
		this.temperature = temperature;
		this.humidity = humidity;
		this.windspeed = windspeed;
	}	

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getWindspeed() {
		return windspeed;
	}

	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}

	@Override
	public String toString() {
		return "WeatherData [loc=" + loc + ", temperature=" + temperature + ", humidity=" + humidity + ", windspeed="
				+ windspeed + "]";
	}
	
	
}
