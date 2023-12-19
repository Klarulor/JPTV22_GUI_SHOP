package com.klarulor.shop_gui;

import com.klarulor.shop_gui.Features.Enums;
import com.klarulor.shop_gui.Features.Enums.SceneLayerType;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("GUI-SHOP!");
        SceneManager.init(stage);
        SceneManager.load(SceneLayerType.LoginLayer);
    }

    public static void main(String[] args) {
        launch();
    }
}