package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField loginUsername;

    @FXML
    private JFXPasswordField loginPassword;

    @FXML
    private JFXButton loginButton;

    @FXML
    void initialize() {

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                loginUser();
                }
        });
    }


    private void loginUser(){
        //get main window

        loginButton.getScene().getWindow().hide();

        if (!loginUsername.getText().toString().trim().equals("")
                && !loginPassword.getText().toString().trim().equals(""))
                {
                    Stage detailsStage = new Stage();
                    try {
                        FXMLLoader loader = new FXMLLoader();

                        Parent root = loader.load(getClass().getResource("/sample/view/details.fxml"));

                         Scene scene = new Scene(root);
                        detailsStage.setScene(scene);
                        detailsStage.show();
                        detailsStage.setResizable(false);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
    }

}


