/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.jobvacancy.controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class HomeController implements Initializable {

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;
    @FXML
    private AnchorPane pane1;
    private ImageView imghome;
    @FXML
    private JFXButton payment1;
    @FXML
    private JFXButton rec1;
    @FXML
    private AnchorPane pane2;
    @FXML
    private AnchorPane myPane;
    @FXML
    private JFXButton interviews;
    @FXML
    private JFXButton Qualifications;
    @FXML
    private JFXButton vacancy;
    @FXML
    private JFXButton buthoME;
    @FXML
    private JFXButton can;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setDateTime();
            loadOnScreen();
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setDateTime() {
        Timeline newTimeLine = new Timeline(new KeyFrame(Duration.seconds(0), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lblDate.setText(new SimpleDateFormat("YYYY-MM-dd").format(new Date()));
                lblTime.setText(new SimpleDateFormat("hh:mm:ss a").format(new Date()));
            }

        }), new KeyFrame(Duration.seconds(1)));
        newTimeLine.setCycleCount(Animation.INDEFINITE);
        newTimeLine.play();
    }

    @FXML
    private void onmouseclickedpay(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/lk/ijse/jobvacancy/view/payments.fxml"));
        myPane.getChildren().clear();
        myPane.getChildren().add(pane);
    }

    @FXML
    private void onmouseclickedrec1(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/lk/ijse/jobvacancy/view/recrutments.fxml"));
        myPane.getChildren().clear();
        myPane.getChildren().add(pane);
    }

    @FXML
    private void onmouseclickedint(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/lk/ijse/jobvacancy/view/Interviews.fxml"));
        myPane.getChildren().clear();
        myPane.getChildren().add(pane);
    }

    @FXML
    private void onmouseclickedQua(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/lk/ijse/jobvacancy/view/Qualifications.fxml"));
        myPane.getChildren().clear();
        myPane.getChildren().add(pane);
    }

    @FXML
    private void onmouseclickedcan(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/lk/ijse/jobvacancy/view/candidate.fxml"));
        myPane.getChildren().clear();
        myPane.getChildren().add(pane);
    }

    @FXML
    private void onmouseclickedvacancy(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/lk/ijse/jobvacancy/view/Jobvacancies.fxml"));
        myPane.getChildren().clear();
        myPane.getChildren().add(pane);
    }

    @FXML
    private void onActionHome(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/lk/ijse/jobvacancy/view/DashBoard.fxml"));
        myPane.getChildren().clear();
        myPane.getChildren().add(pane);
    }

    public void loadOnScreen() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/lk/ijse/jobvacancy/view/DashBoard.fxml"));
        myPane.getChildren().clear();
        myPane.getChildren().add(pane);
    }

}
