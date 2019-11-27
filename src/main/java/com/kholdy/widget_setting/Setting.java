package com.kholdy.widget_setting;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Setting {

	public static void setting(String title) throws IOException {
		
		Stage window = new Stage();
		FXMLLoader loader = new FXMLLoader(Setting.class.getResource("settingView.fxml"));
		AnchorPane rootNode = (AnchorPane) loader.load();
		
		Scene scene = new Scene(rootNode, window.getWidth(), window.getHeight());
		window.setScene(scene);
		window.setTitle(title);
		window.show();
		
	}
	
}
