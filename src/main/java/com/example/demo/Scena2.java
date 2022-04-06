package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Scena2 {

//    private int result;

    @FXML
    private Text result;
    @FXML
    private Button back;
    @FXML
    protected void buttonClick() throws IOException {
        Stage stage;
        Parent root;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root = loader.load();
        stage = (Stage) back.getScene().getWindow();
        Scene scena1 = new Scene(root);
        stage.setScene(scena1);
        stage.setTitle("Calcola con noi");
        stage.show();

    }

    public void setResult(int valore){
        String temp = String.valueOf(valore);
        this.result.setText(temp);
    }
}
