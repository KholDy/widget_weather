package com.kholdy.widget_weather;

import java.io.IOException;

import com.kholdy.widget_setting.Setting;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {
	private Weather weather;

    @FXML
    private ImageView refrash;

    @FXML
    private ImageView setting;
    
    @FXML
    private ImageView close;
    
    @FXML
    private ImageView weather_icon;
    
    @FXML
    private Label city;
    
    @FXML
    private Label data;

    @FXML
    private Label temp;

    @FXML
    private Label wind;

    @FXML
    private Label pressure;

    @FXML
    private Label weath;
    
    @FXML
    void refresh(MouseEvent event) {
    	weather = new Weather();
    	city.setText(weather.city());
    	data.setText("Сегодня: " + weather.data());
    	temp.setText("Температура: " + weather.temp() + (char)8451);
    	wind.setText("Ветер: " + weather.wind());
    	pressure.setText("Давление: " + weather.pressure());
    	weath.setText(weather.weath());
    	
    	if(weather.weath().equals(WeatherTypes.LIGHT_RAIN.value)) {
    		weather_icon.setImage(new Image("file:res/weather_icons/light_rain_48px.png"));
    	}
    	if(weather.weath().equals(WeatherTypes.PARTLY_CLOUDY_DAY.value)) {
    		weather_icon.setImage(new Image("file:res/weather_icons/partly_cloudy_day_48px.png"));
    	}
    	if(weather.weath().equals(WeatherTypes.PARTLY_CLOUDY_RAIN.value) || weather.weath().equals(WeatherTypes.LOW_BLOCK_RAIN.value)) {
    		weather_icon.setImage(new Image("file:res/weather_icons/partly_cloudy_rain_48px.png"));
    	}
    	if(weather.weath().equals(WeatherTypes.CLOUDY.value)) {
    		weather_icon.setImage(new Image("file:res/weather_icons/clouds_48px.png"));
    	}
    }
    
    @FXML
    void setting(MouseEvent event) throws IOException {
    	Setting.setting("Setting");
    }
    
    @FXML
    void close(MouseEvent event) {
    	Platform.exit();
    }

}
