package com.example.gestorcitas2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button bttlog;

    @FXML
    private TextField txtnom;

    @FXML
    private TextField txtpss;

    @FXML
    private void ButtonLogin(ActionEvent event) {
        if (bttlog.isPressed()) {
        }
        try {
            // 1. Cargar el nuevo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CitasView.fxml"));
            Parent root = loader.load();

            // 2. Obtener el Stage (ventana) actual desde el evento que activó la acción
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // 3. Crear la nueva escena y asignarla al Stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Gestión de Citas - Centro Médico San Mateo");
            stage.show();

        } catch (IOException e) {
            System.err.println("Error al cargar la vista CitasView.fxml: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
