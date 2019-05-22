/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author wfeli
 */
public class Main extends Application {

    private static Stage primaryStage;
    private static BorderPane mainPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        Main.primaryStage.setTitle("Restaurante");
        Main.primaryStage.setResizable(false);
        showViewMain();
        showViewLogin();
    }

    public void showViewMain() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("views/ViewMain.fxml"));
        Main.mainPane = loader.load();
        Scene scene = new Scene(Main.mainPane);
        Main.primaryStage.setScene(scene);
        Main.primaryStage.setResizable(false);
        Main.primaryStage.show();
    }

    public static void showViewLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("login/ViewLogin.fxml"));
        BorderPane borderPane = loader.load();
        Main.mainPane.setCenter(borderPane);
    }

    public static void showViewAccount() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("views/ViewAccount.fxml"));
        BorderPane borderPane = loader.load();
        Main.mainPane.setCenter(borderPane);
    }

    public static void main(String[] a) {
        launch(a);
    }
}
