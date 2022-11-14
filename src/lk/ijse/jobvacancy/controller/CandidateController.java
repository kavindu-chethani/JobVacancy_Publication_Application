/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.jobvacancy.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.jobvacancy.bo.custom.CanditateBO;
import lk.ijse.jobvacancy.bo.custom.impl.CanditateBOImpl;
import lk.ijse.jobvacancy.model.CandidateDTO;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class CandidateController implements Initializable {

    @FXML
    private JFXButton ADD;
    @FXML
    private JFXButton Update;
    @FXML
    private JFXButton Delete;
    @FXML
    private JFXTextField txtFname;
    @FXML
    private JFXTextField txtlName;
    @FXML
    private JFXTextField txtAddress;
    @FXML
    private JFXTextField txtEmail;
    @FXML
    private RadioButton butMale;
    @FXML
    private ToggleGroup genderGroup;
    @FXML
    private RadioButton butFemale;
    @FXML
    private JFXTextField txtTel;
    @FXML
    private JFXTextField txtDateOfBirth;
    @FXML
    private JFXTextField txtNic;
    @FXML
    private JFXTextField txtCID;

    private static CanditateBO canBO = new CanditateBOImpl();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        butMale.setUserData("Male");
        butFemale.setUserData("Female");
    }

    @FXML
    private void clickedAdd(MouseEvent event) throws Exception {

        CandidateDTO can = new CandidateDTO(txtCID.getText(), txtFname.getText(), txtlName.getText(), txtDateOfBirth.getText(), genderGroup.getSelectedToggle().getUserData().toString(), txtAddress.getText(), Integer.parseInt(txtTel.getText()), txtEmail.getText());
        boolean isAdded = canBO.savecustomer(can);
        if (isAdded) {
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION, "Added Sucessfully", ButtonType.OK);
            alert.show();
        }
    }

    @FXML
    private void clickedUpdate(MouseEvent event) {
    }

    @FXML
    private void clickedDele(MouseEvent event) {
    }

}
