package com.example.gestorcitas2;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

public class HelloController {

    @FXML
    private Button bttlog;

    @FXML
    private TextField txtnom;

    @FXML
    private TextField txtpss;

    @FXML
    private void ButtonLogin(ActionEvent event) {
        String nom = txtnom.getText();
        String pss = txtpss.getText();
    }
}

