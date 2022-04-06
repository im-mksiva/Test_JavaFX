package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button calcola;
    @FXML
    private TextField numero1, numero2;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        // prendo i dati ingresso (che sono ancora delle stringhe)
        Integer num1 = Integer.valueOf(numero1.getText());
        Integer num2 = Integer.valueOf(numero2.getText());

        // conversione in int
        int risultato = num1 + num2;

        Stage stage;
        Parent root; //scena più grande di tutti nella finestra
        stage = (Stage) calcola.getScene().getWindow();

        // passare i dati
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scena2.fxml"));
        root = loader.load();
        Scena2 controller2 = loader.getController();
        controller2.setResult(risultato);

        Scene scena2 = new Scene(root);
        stage.setScene(scena2);
        stage.setTitle("Risultato");
        stage.show();



    }
}