/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.views;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author wfeli
 */
public class ViewAccountController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private StackPane stack;
    @FXML
    private JFXButton btnSettings;

    private void setImageViewButton() {
        ImageView imageViewBtnSearch = new ImageView(new Image("/restaurant/res/baseline_settings_white_18dp.png"));
        imageViewBtnSearch.setFitHeight(20);
        imageViewBtnSearch.setFitWidth(20);
        this.btnSettings.setGraphic(imageViewBtnSearch);
    }

    @FXML
    private void setSettings() {
        try {
            JFXDialogLayout content = new JFXDialogLayout();
            content.setHeading(new Text("Configuração da conta"));
            JFXDialog dialog = new JFXDialog(stack, content, JFXDialog.DialogTransition.BOTTOM);
            JFXButton button = new JFXButton("FINALIZAR");
            button.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                @Override
                public void handle(javafx.event.ActionEvent event) {
                    dialog.close();
                }
            });
            button.setStyle("-fx-background-color:  #E73835; -fx-text-fill: white;");
            button.setAccessibleHelp("COE RAPAZIADA");
            content.setActions(button);
            content.setBody(new Text("BODY TESTE"));
            dialog.show();
        } catch (Exception ex) {
            Logger.getLogger(ViewAccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setImageViewButton();
    }

}
