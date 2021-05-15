package edu.game;


import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private ResourceBundle resource;

    @FXML
    private URL location;

    @FXML
    private Button first;

    @FXML
    void initialize() {
        first.setOnAction(event -> {

        });
    }

}

