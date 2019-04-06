package com.trykote.labyrinthfx;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LabyrinthFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final Logger log = LogManager.getLogger(this.getClass().getName());
        final Injector injector = Guice.createInjector(new Configuration());

        log.trace("FXMLLoader load resource...");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));

        log.trace("Setting up Guice controller factory...");
        loader.setControllerFactory(injector::getInstance);

        log.trace("Load parent...");
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        log.trace("Show scene...");
        log.fatal("Fatal");
        stage.show();
    }
}
