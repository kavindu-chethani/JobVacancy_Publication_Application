/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.jobvacancy.controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton login;
    @FXML
    private AnchorPane root1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
    

    @FXML
    private void onmouseclicked1(MouseEvent event) throws IOException {
         Parent parent=FXMLLoader.load(this.getClass().getResource("/lk/ijse/jobvacancy/view/Home.fxml"));
        Scene scen=new Scene(parent);
        Stage window = (Stage) this.root1.getScene().getWindow();
        window.setScene(scen);
        window.centerOnScreen();
    }

   
    
}
