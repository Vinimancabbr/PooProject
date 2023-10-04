package com.mycompany.pooproject;

import com.mycompany.pooproject.Classes.Eletrodomestico;
import com.mycompany.pooproject.Classes.Geladeira;
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
import java.util.ArrayList;



public class TelaInicialController implements Initializable {
    
    /*--creating Objects--*/
        
    ArrayList<Geladeira> geladeiraList;
    
    Geladeira gela1 = new Geladeira("teste1", "exMarca1", "exCor1", 100, 50, 100, "10 x 20 x 30 cm", true);
    Geladeira gela2 = new Geladeira("teste2", "exMarca2", "exCor2", 200, 150, 200, "20 x 30 x 40 cm", false);
    Geladeira gela3 = new Geladeira("teste3", "exMarca3", "exCor3", 300, 250, 300, "30 x 140 x 50 cm", true);
    Geladeira gela4 = new Geladeira("teste4", "exMarca4", "exCor4", 400, 350, 400, "60 x 70 x 80 cm", false);
    Geladeira gela5 = new Geladeira("teste5", "exMarca5", "exCor5", 500, 450, 500, "90 x 100 x 110 cm", true);
        
        String[] geladeiras = {gela1.getFinalName(), gela2.getFinalName(), gela3.getFinalName(), gela4.getFinalName(), gela5.getFinalName()};

/*Scene changer funcionality--*/
    private Stage stage;
    private Scene scene;
    private Parent root;
    
   
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
        URL url = getClass().getResource("scene2.fxml");
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
    
    
    private final String[] types = {"                                                                                      ", 
        "Microondas", 
        "Geladeira", 
        "Maquina De Lavar"};
    
    @FXML private ListView<String> leftListView;
    @FXML private ListView<String> rightListView;
    
    public void createList (ActionEvent event) {

        String[] microondas = {"Micro1", "Micro2", "Micro3", "Micro4"};
        //String[] geladeiras = {"Gela1", "Gela2", "Gela3", "Gela4"};
        String[] maquinasDeLavar = {"maquina1", "maquina2", "maquina3", "maquina4"};
        
        String type = typeChoice.getValue();
        leftListView.getItems().clear();
        rightListView.getItems().clear();
        switch (type) {
            case "Microondas":
                leftListView.getItems().addAll(microondas);
                rightListView.getItems().addAll(microondas);
                break;
            case "Geladeira":
                leftListView.getItems().addAll(geladeiras);
                rightListView.getItems().addAll(geladeiras);
                break;
            case "Maquina De Lavar":
                leftListView.getItems().addAll(maquinasDeLavar);
                rightListView.getItems().addAll(maquinasDeLavar);
                break;
            default:
                break;
        }
    }
/*--List funcionality*/
    
    @Override public void initialize(URL url, ResourceBundle rb) {
        
        typeChoice.getItems().addAll(types);
        typeChoice.setOnAction(this::createList);
    }
}


