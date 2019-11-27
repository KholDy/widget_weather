package com.kholdy.widget_weather;

public enum City {
	
	MOSCOW ("https://www.gismeteo.ru/weather-moscow-4368/now/"),
	ST_PETERSBURG ("https://www.gismeteo.ru/weather-sankt-peterburg-4079/now/"),
	SARATOV ("https://www.gismeteo.ru/weather-saratov-5032/now/");
	
	private String value;
	
	private City(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
