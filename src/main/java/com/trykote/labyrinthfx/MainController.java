package com.trykote.labyrinthfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;

import javax.inject.Singleton;

@Singleton
public class MainController {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    public void initialize() {
        Line line = new Line(5,5, 200, 150);
        line.setStroke(Color.BLACK);

        anchorPane.getChildren().setAll(line);
    }

    public void onAbout() {

    }
}
