package com.mycompany.pooproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;



public class TelaInicialController implements Initializable {

/*Scene changer funcionality--*/
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML private Button compareButton;
    
    public void switchToScene1(ActionEvent event) throws IOException {
        URL url = getClass().getResource("scene1.fxml");
        root = FXMLLoader.load(url);
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("scene1.css").toExternalForm());
        stage.setScene(scene);
        stage.show(); 
        
    }
    public void switchToScene2(ActionEvent event) throws IOException { 
        URL url = getClass().getResource("secondary.fxml");
        root = FXMLLoader.load(url);
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("scene1.css").toExternalForm());
        stage.setScene(scene);
        stage.show();  
        }
    
    
/*--Scene changer funcionality*/
    
/*List funcionality--*/
    @FXML private ChoiceBox<String> typeChoice;
    
    private String[] types = {"                                                                                      ", 
        "Microondas", 
        "Geladeira", 
        "Maquina De Lavar"};
    
    @FXML private ListView<String> leftListView;
    @FXML private ListView<String> rightListView;
    
    String[] microondas = {"Micro1", "Micro2", "Micro3", "Micro4"};
    String[] geladeiras = {"Gela1", "Gela2", "Gela3", "Gela4"};
    String[] maquinasDeLavar = {"maquina1", "maquina2", "maquina3", "maquina4"};
    
    public void createList (ActionEvent event) {
        String type = typeChoice.getValue();
        leftListView.getItems().clear();
        rightListView.getItems().clear();
        if (type.equals("Microondas")){
            leftListView.getItems().addAll(microondas);
            rightListView.getItems().addAll(microondas);
        } else if (type.equals("Geladeira")) {
                leftListView.getItems().addAll(geladeiras);
                rightListView.getItems().addAll(geladeiras);
            } else if (type.equals("Maquina De Lavar")) {
                    leftListView.getItems().addAll(maquinasDeLavar);
                    rightListView.getItems().addAll(maquinasDeLavar);
                } else {  
            }
    }
/*--List funcionality*/
    
    @Override public void initialize(URL url, ResourceBundle rb) {
        typeChoice.getItems().addAll(types);
        typeChoice.setOnAction(this::createList);
    }
}


