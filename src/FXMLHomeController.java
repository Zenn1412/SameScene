import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;



public class FXMLHomeController<AnchorePane> implements Initializable {

    @FXML
    private BorderPane borderpane;

    @FXML 
    private Button dashboard;

    @FXML
    private Button settings;

    @FXML
    private Button about;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
        @FXML
        private void btnDashboard(ActionEvent event) throws IOException{
        AnchorePane view = FXMLLoader.load(getClass() .getResource("/view/Dashboard.fxml"));
        borderpane.setCenter((Node) view);
        }

        @FXML
        private void btnSettings(ActionEvent event) throws IOException {
        AnchorePane view = FXMLLoader.load(getClass() .getResource("/view/Settings.fxml"));
        borderpane.setCenter((Node) view);
        }

        @FXML 
        private void btnAbout(ActionEvent event) throws IOException{
AnchorePane view = FXMLLoader.load(getClass() .getResource("/view/About.fxml"));
        borderpane.setCenter((Node) view);
        

    }
    }

