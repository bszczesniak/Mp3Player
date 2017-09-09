package pl.javastart.mp3player.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuPaneController implements Initializable {

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private Menu fileMenu;

    public MenuItem getFileMenuItem() {
        return fileMenuItem;
    }

    public MenuItem getDirMenuItem() {
        return dirMenuItem;
    }

    public MenuItem getCloseMenuItem() {
        return closeMenuItem;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        configureMenu();
    }

    private void configureMenu() {
        closeMenuItem.setOnAction(x -> Platform.exit());

        aboutMenuItem.setOnAction(new EventHandler<ActionEvent>() {            @Override
        public void handle(ActionEvent arg0) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("About KNAK Mp3 Player");
            alert.setHeaderText(null);
            alert.setContentText("author - Bartłomiej Szczęśniak \n\n"
                    + "em@ail - bartlomiej.szczesniak@gmail.com\n\n"
                    + "github - github.com/bszczesniak");
            alert.showAndWait();

        }
        });
    }
}