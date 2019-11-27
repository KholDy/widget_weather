package com.kholdy.widget_weather;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Weather {
	
	private Document doc;
	public static String url;
	
	public Weather()  {
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			Alert errorAlert = new Alert(AlertType.INFORMATION);
			errorAlert.setContentText(e.toString());;
			errorAlert.showAndWait();
		} catch (IllegalArgumentException e) {
			Alert errorAlert = new Alert(AlertType.INFORMATION);
			errorAlert.setContentText("Choose a city!");;
			errorAlert.showAndWait();
		}
	}
	
	public String city() {
		return doc.getElementsByClass("subnav_search_city js_citytitle").first().text();
	}
	
	public String data() {
		return doc.getElementsByClass("date ").first().text();
	}
	
	public String temp() {
		return doc.getElementsByClass("js_value tab-weather__value_l").first().text();
	}
	
	public String wind() {
		return doc.getElementsByClass("unit unit_wind_m_s").first().text();
	}
	
	public String pressure() {
		return doc.getElementsByClass("unit unit_pressure_mm_hg_atm").first().text();
	}
	
	public String weath() {
		return doc.getElementsByClass("tip _top _center").first().text();
	}
}
