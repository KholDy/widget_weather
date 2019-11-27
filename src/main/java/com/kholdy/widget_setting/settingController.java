package com.kholdy.widget_setting;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import com.kholdy.widget_weather.City;
import com.kholdy.widget_weather.Weather;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;

public class settingController implements Initializable{
	
    @FXML
    private ChoiceBox<String> comboBoxCity;
    
    @FXML
    private Button cityApply;
    
    @FXML
    private Hyperlink gismeteo;

    @FXML
    void cityApply(ActionEvent event) {
    	if(comboBoxCity.getValue().equals("Москва")) {
    		Weather.url = City.MOSCOW.getValue();
    	}
    	
    	if(comboBoxCity.getValue().equals("Санкт-Петербург")) {
    		Weather.url = City.ST_PETERSBURG.getValue();
    	}
    	
    	if(comboBoxCity.getValue().equals("Саратов")) {
    		Weather.url = City.SARATOV.getValue();
    	}
    }
    
    @FXML
    void gismeteo(ActionEvent event) {
    	try {
			Desktop.getDesktop().browse(new URI("https://www.gismeteo.ru/"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    }
    
	public void initialize(URL location, ResourceBundle resources) {
		comboBoxCity.getItems().addAll("Москва", "Санкт-Петербург", "Саратов");
	}

}
