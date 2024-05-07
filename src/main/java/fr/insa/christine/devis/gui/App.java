package fr.insa.christine.devis.gui;


import fr.insa.christine.devis.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        SceneWelcome sceneWelcome = new SceneWelcome(primaryStage);
        sceneWelcome.setupWelcomeWindow();
    }
}
