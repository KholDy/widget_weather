package com.kholdy.widget_weather;

public enum WeatherTypes {
	LIGHT_RAIN ("Пасмурно, небольшой дождь"),
	PARTLY_CLOUDY_DAY ("Переменная облачность"),
	PARTLY_CLOUDY_RAIN ("Облачно, небольшой дождь"),
	LOW_BLOCK_RAIN ("Малооблачно, небольшой дождь"),
	CLOUDY("Пасмурно");
	
	String value;
	
	private WeatherTypes(String value) {
		this.value = value;
	}
}
