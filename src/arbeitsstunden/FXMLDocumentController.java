/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbeitsstunden;

import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javax.swing.text.Element;

/**
 *
 * @author mail
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField reason;
    @FXML
    private ComboBox<String> name;
    @FXML
    private TextField count;
    @FXML
    private DatePicker date;
    @FXML
    private Button addButton;
    @FXML
    private Button delButton;
    @FXML
    private TextField test;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.getItems().setAll("Heinz", "Peter", "Heinz", "Peter", "Heinz", "Peter", "Heinz", "Peter", "Heinz", "Peter", "Heinz", "Peter", "Heinz", "Peter");
      
    }    
    
    @FXML
    protected void handleaddButtonAction(ActionEvent event) {
        addEntry(name.getValue(),reason.getText(),date.getValue(),count.getText());
    }
    
    private void addEntry(String name, String reason, LocalDate reasonDate, String reasonCount){
        test.setText(name + reason + reasonDate.toString() + reasonCount + "asfjf");
        
    }
    
    
}
