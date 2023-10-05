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
   
    private final String[] types = {"                                                                                      ", 
        "Microondas", 
        "Geladeira", 
        "Maquina De Lavar"};
    
    @FXML  private ListView<String> leftListView;
    @FXML  private ListView<String> rightListView;
    
    public void createList (ActionEvent event) {
        String[] microondas = {"Micro1", "Micro2", "Micro3", "Micro4"};
        String[] geladeiras = {"exMarca1 teste1", "exMarca2 teste1", "exMarca3 teste1", "exMarca4 teste1", "exMarca5 teste5", "exMarca6 teste6", "exMarca7 teste7", "exMarca8 teste8", "exMarca9 teste9", "exMarca10 teste10"};
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
        public void getSelected() {
        String type = typeChoice.getValue();
        String leftEletroName = leftListView.getSelectionModel().getSelectedItem();
        String rightEletroName = rightListView.getSelectionModel().getSelectedItem();
        
//Escolhe que tipo de eletro vai ser carregado pra não carregar todos simultaneamente;
        switch (type) {
            case "Geladeira":
        System.out.println("Escolheu geladeira");
                ArrayList<Geladeira> geladeiraArray = new ArrayList<Geladeira>();
                
                Geladeira geladeiraSelecionadaEsquerda = new Geladeira("placeHolder left");
                Geladeira geladeiraSelecionadaDireita = new Geladeira("placeHolder right");

                geladeiraArray.add(new Geladeira("teste1", "exMarca1", "exCor1", 100, 50, 100, "10 x 20 x 30 cm", true));
                geladeiraArray.add(new Geladeira("teste2", "exMarca2", "exCor2", 200, 150, 200, "20 x 30 x 40 cm", false));
                geladeiraArray.add(new Geladeira("teste3", "exMarca3", "exCor3", 300, 250, 300, "30 x 140 x 50 cm", true));
                geladeiraArray.add(new Geladeira("teste4", "exMarca4", "exCor4", 400, 350, 400, "60 x 70 x 80 cm", false));
                geladeiraArray.add(new Geladeira("teste5", "exMarca5", "exCor5", 500, 450, 500, "90 x 100 x 110 cm", true));
                geladeiraArray.add(new Geladeira("teste6", "exMarca6", "exCor6", 100, 50, 100, "10 x 20 x 30 cm", true));
                geladeiraArray.add(new Geladeira("teste7", "exMarca7", "exCor7", 200, 150, 200, "20 x 30 x 40 cm", false));
                geladeiraArray.add(new Geladeira("teste8", "exMarca8", "exCor8", 300, 250, 300, "30 x 140 x 50 cm", true));
                geladeiraArray.add(new Geladeira("teste9", "exMarca9", "exCor9", 400, 350, 400, "60 x 70 x 80 cm", false));
                geladeiraArray.add(new Geladeira("teste10", "exMarca10", "exCor10", 500, 450, 500, "90 x 100 x 110 cm", true));
//Processo de pegar as instâncias das selecionadas;
                for (Geladeira std : geladeiraArray) {
                    if ((std.getFinalName()).equalsIgnoreCase(leftEletroName)) {
                        geladeiraSelecionadaEsquerda = std; 
                        System.out.println("Esquerda:" + geladeiraSelecionadaEsquerda.getFinalName());
                    }
                    if ((std.getFinalName()).equalsIgnoreCase(rightEletroName)) {
                        geladeiraSelecionadaDireita = std;    
                        System.out.println("Direita: " + geladeiraSelecionadaDireita.getFinalName());
                    }
                }
                TelaComparacaoController.comparar(geladeiraSelecionadaEsquerda, geladeiraSelecionadaDireita);
        }  
    }
        
        
/*--Funcionalidade de pegar as instâncias das que serão comparadas*/ 

    
    @Override public void initialize(URL url, ResourceBundle rb) {
        typeChoice.getItems().addAll(types);
        typeChoice.setOnAction(this::createList);
    }
    
}



    


