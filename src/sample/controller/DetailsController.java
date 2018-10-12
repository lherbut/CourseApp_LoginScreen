package sample.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class DetailsController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    private Label detailsName;

    @FXML
    private Label detailsAge;

    @FXML
    private Label detailsProfession;

    @FXML
    private Hyperlink detailsLinked;

    @FXML
    private Hyperlink detailsGit;

    @FXML
    void initialize() {

        detailsLinked.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/lucjan-herbut-aab101133/"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        detailsGit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()){
                    try {
                        Desktop.getDesktop().browse(new URI("https://github.com/lherbut"));
                    } catch (IOException e) {

                        
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


    }

    void setName(String name, String profession, int age){
        detailsAge.setText("Age: " + String.valueOf(age));
        detailsProfession.setText("Profession: " + profession);
        detailsWelcomeLabel.setText("Welcome " + name);
        detailsName.setText("Name: " + name);
    }


}
