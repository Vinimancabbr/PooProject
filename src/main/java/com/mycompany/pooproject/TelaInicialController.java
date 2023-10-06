package com.mycompany.pooproject;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.pooproject.Classes.Eletrodomestico;
import com.mycompany.pooproject.Classes.Geladeira;
import java.io.File;
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
import java.util.List;



public class TelaInicialController implements Initializable {
    
    
/*--Funcionalidade de mudança de cena--*/
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
        getSelected();
        stage.show();
        }
/*--Funcionalidade de mudança de cena*/
    
/*--Funcionalidade da lista--*/
    @FXML private ChoiceBox<String> typeChoice;
   
    private final String[] types = { 
        "Microondas", 
        "Geladeira", 
        "Maquina De Lavar"};
    
    @FXML  private ListView<String> leftListView;
    @FXML  private ListView<String> rightListView;
    
    public void createList (ActionEvent event) {
        
        String[] microondas = {"Micro1", "Micro2", "Micro3", "Micro4"};
        String[] geladeiras = {"Brastemp BRM45HK", "Brastemp BRM44HK", "Brastemp BRE57AK", "Brastemp Bro85ak", "Brastemp BRE57AB", 
            "Brastemp BRE85AK", "Brastemp BRM54JK", "Brastemp BRM45JB", "Brastemp BRM45JK", "Brastemp BRE85AB", "Brastemp BRM44HK", 
            "Brastemp BRM56BK", "Consul CRE44BK", "Consul CRB39", "Consul CRM44AK", "Consul CRM39AK", "Consul CRM56FK",
            "Consul CRM44AB", "Consul CRE44BB", "Consul CRB39AK", "Consul CRM56FB", "Consul  CRB39AB", "Consul CRM39AB", "Consul CRB36AB", 
            "Consul CRD37EB", "Electrtolux IB45S", "Electrtolux DB44S", "Electrtolux IM8S", "Electrtolux TF39S", "Electrtolux DFX41", 
            "Electrolux DW44S", "Electrtolux TF56S", "Electrtolux DC35A", "Electrtolux DFN41", "Electrtolux RE31", "Electrtolux TF39",
            "Electrtolux TF42S", "Electrtolux IB55", "Electrtolux DF44S", "Electrtolux if45", "Parasonic NR-BB53GV3B"};
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
        leftListView.getSelectionModel().select(0);
        rightListView.getSelectionModel().select(0);
    }
/*--Funcionalidade da lista*/
    
/*--Funcionalidade de pegar as instâncias das que serão comparadas--*/ 
        public void getSelected() throws IOException {
        String type = typeChoice.getValue();
        String leftEletroName = leftListView.getSelectionModel().getSelectedItem();
        String rightEletroName = rightListView.getSelectionModel().getSelectedItem();
        
//Escolhe que tipo de eletro vai ser carregado pra não carregar todos simultaneamente;
        switch (type) {
            case "Geladeira":
            System.out.println("Escolheu geladeira");
                List<Geladeira> geladeiraArray = Geladeira.createList();
                System.out.println(geladeiraArray.get(0));
                System.out.println((geladeiraArray.get(0)).getFinalName());
                
                Geladeira geladeiraSelecionadaEsquerda = new Geladeira("placeHolder left");
                Geladeira geladeiraSelecionadaDireita = new Geladeira("placeHolder right");

//Processo de pegar as instâncias das selecionadas;
                System.out.println("Para comparar esquerda: " + leftEletroName);
                System.out.println("Para comparar direita: " + rightEletroName);
                for (Geladeira std : geladeiraArray) {
                    System.out.println("Valor atual: " + std.getFinalName());
                    if ((std.getFinalName()).equalsIgnoreCase(leftEletroName)) {
                        geladeiraSelecionadaEsquerda = std; 
                        System.out.println("Esquerda:" + geladeiraSelecionadaEsquerda.getFinalName());
                    }
                    if ((std.getFinalName()).equalsIgnoreCase(rightEletroName)) {
                        geladeiraSelecionadaDireita = std;    
                        System.out.println("Direita: " + geladeiraSelecionadaDireita.getFinalName());
                    }
                }
                TelaComparacaoController.comparar(geladeiraSelecionadaEsquerda, geladeiraSelecionadaDireita, type);
        }  
    }
        
        
/*--Funcionalidade de pegar as instâncias das que serão comparadas*/ 

    
    @Override public void initialize(URL url, ResourceBundle rb) {
        typeChoice.getItems().addAll(types);
        typeChoice.setOnAction(this::createList);
        typeChoice.setValue(types[0]);
    }
    
}



    


