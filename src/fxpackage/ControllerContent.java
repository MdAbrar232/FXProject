package fxpackage;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class ControllerContent {

    @FXML
    ImageView myImageView;
    @FXML
    Label Name;
    @FXML
    Label genre;
    @FXML
    Label datePublished;
    @FXML
    Label price;
    @FXML
    Label priceAfterDiscount;
    @FXML
    Button myButton1;

    Image myImage = new Image((getClass().getResourceAsStream("Shrek2.jpg")));
    Image myImage2 = new Image((getClass().getResourceAsStream("Shrek.jpg")));

    public void displayImage(){
        myImageView.setImage(myImage);
    }
    public void displayImage2(){
        myImageView.setImage(myImage2);
    }
}
