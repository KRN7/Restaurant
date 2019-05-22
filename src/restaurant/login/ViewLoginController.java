/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import restaurant.Main;

/**
 *
 * @author wfeli
 */
public class ViewLoginController implements Initializable {

    @FXML
    private JFXTextField tfUsername;
    @FXML
    private JFXPasswordField tfSenha;
    @FXML
    private JFXButton btnLogin;

    @FXML
    private void setViewAccount() throws IOException {
        Main.showViewAccount();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
