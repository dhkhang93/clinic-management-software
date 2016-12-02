/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Khang_PC
 */
public class FXML_Controller implements Initializable {
    
    @FXML
    private Label actionLogin;
    
    @FXML
    private void dosomething(ActionEvent event) {
        System.out.println("You clicked me!");
        actionLogin.setText("Username or password incorrect");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
