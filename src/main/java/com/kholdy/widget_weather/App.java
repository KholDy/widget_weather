package com.kholdy.widget_weather;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application{
    
	private double xOffset;
	private double yOffset;
	
	@Override
	public void start(final Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(App.class.getResource("view.fxml"));
		AnchorPane rootNode = (AnchorPane) loader.load();
		
		Scene scene = new Scene(rootNode, primaryStage.getWidth(), primaryStage.getHeight());
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		scene.setFill(Color.TRANSPARENT);
		
		scene.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				xOffset = primaryStage.getX() - event.getScreenX();
	            yOffset = primaryStage.getY() - event.getScreenY();
			}
		});
		
		scene.setOnMouseDragged(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent event) {
				primaryStage.setX(event.getScreenX() + xOffset);
				primaryStage.setY(event.getScreenY() + yOffset);
			}

		});
		
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
    public static void main( String[] args ) throws IOException {
    	launch(args);
    }
}
