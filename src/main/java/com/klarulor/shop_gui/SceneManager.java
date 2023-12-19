package com.klarulor.shop_gui;


import com.klarulor.shop_gui.Features.Enums.SceneLayerType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;


public class SceneManager {
    private static Stage _stage;

    private static Dictionary<SceneLayerType, Scene> _scenes = new Hashtable<>();

    public static void init(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        _scenes.put(SceneLayerType.LoginLayer, scene);

        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 320, 240);
        _scenes.put(SceneLayerType.LoginLayer, scene);


        stage.setScene(scene);
        stage.show();
    }
    public static void load(SceneLayerType layer){

    }

    public static void set_stage(Stage stage){
        if(_stage != null)
            throw new RuntimeException("Cannot asign second time");
        _stage = stage;
    }


}
