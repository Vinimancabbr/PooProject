package com.mycompany.pooproject;

import com.mycompany.pooproject.Classes.AirFrier;
import com.mycompany.pooproject.Classes.Geladeira;
import com.mycompany.pooproject.Classes.Liquidificador;
import com.mycompany.pooproject.Classes.MaquinaDeLavar;
import com.mycompany.pooproject.Classes.Microondas;
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
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
        "Geladeira", "Microondas", "Liquidificador", "Air Frier", "Maquina de lavar",
    };
    
    @FXML  private ListView<String> leftListView;
    @FXML  private ListView<String> rightListView;
    
    public void createList (ActionEvent event) {
        
        
        String[] geladeiras = {"Brastemp BRM45HK", "Brastemp BRM44HK", "Brastemp BRE57AK", "Brastemp Bro85ak", "Brastemp BRE57AB", 
            "Brastemp BRE85AK", "Brastemp BRM54JK", "Brastemp BRM45JB", "Brastemp BRM45JK", "Brastemp BRE85AB", "Brastemp BRM44HK", 
            "Brastemp BRM56BK", "Consul CRE44BK", "Consul CRB39", "Consul CRM44AK", "Consul CRM39AK", "Consul CRM56FK",
            "Consul CRM44AB", "Consul CRE44BB", "Consul CRB39AK", "Consul CRM56FB", "Consul CRB39AB", "Consul CRM39AB", "Consul CRB36AB", 
            "Consul CRD37EB", "Electrtolux IB45S", "Electrtolux DB44S", "Electrtolux IM8S", "Electrtolux TF39S", "Electrtolux DFX41", 
            "Electrolux DW44S", "Electrtolux TF56S", "Electrtolux DC35A", "Electrtolux DFN41", "Electrtolux RE31", "Electrtolux TF39",
            "Electrtolux TF42S", "Electrtolux IB55", "Electrtolux DF44S", "Electrtolux if45", "Parasonic NR-BB53GV3B"};
        String[] microondas = {"LG MS3097AR", "Electrolux MT30S", "Electrolux MI41T", "Electrolux MI41S", "Electrolux ME3EP", "Electrolux ME23P", "Electrolux MB37R", 
            "Electrolux ME41X", "Electrolux MTO30", "Electrolux MS37R", "Electrolux ME36S", "Electrolux ME36B", "Electrolux ME23B", "Philco PMO34IP0", "Philco PMO42EB", 
            "Philco PMO37ES", "Philco PME31BM", "Philco PMO28TF", "Philco PMO37BB", "Philco PMR28V", "Philco PMO34BB", "Philco PMO37EB", "Philco PMO34ES", "Philco PMO62IE"};
        String[] liquidificadores = {"Oster OLIQ610", "Oster OLIQ606", "Oster BLSTMG-BR8", "Oster OLIQ605", "Oster OLIQ501", 
            "Oster BLST4655Z", "Oster BLSTPBRG", "Oster BLSTPYG1210RBG17", "Oster BLSTMG-BR8", "Oster BLSTTDT-NBG", "Oster BLSTMG-RR8", 
            "Oster LST3B-R2T", "Oster BLST4655B", "Oster BLST4128", "Mondial L-99-FB", "Mondial L-1200-BI", "Mondial L-900", 
            "Mondial  L-1400-GI", "Mondial  L-1100-BI", "Mondial LPA-01", "Philco PLQ1412P", "Philco PLQ1300P", "Philco PLQ1350", 
            "Philco Samurai Premium", "Philco ph1200", "Britania BLQ1300RS", "Britania B1500P", "Britania BLQ1350", "Britania BLQ2300V", "Britania BLQ1280P",};
        String[] airFriers = {"Mondial AF-32-RL", "Mondial AF-30-DI", "Mondial AFN-40-BI", "Mondial AFN-50-BI", "Mondial AFN-80-BI", 
            "Mondial AF-31", "Mondial NAF-05", "Mondial AFO-12L-BI", "Mondial AF-30-I", "Mondial AFD-01-BI", "Mondial AF-30-DI", 
            "Mondial AF-32-RI", "Philco Jumbo InoxPfr06pi", "Philco Gourmet Pfr13p", "Philco Pfr2200", "Philco Pfr16p Gourmet Black Plus", 
            "Philco Pfr3000pi", "Philco Pfr15v", "Philco PFR2250V", "Philco PFR13P", "Philco PFR06PI", "Philco PFR55PI", "Philco PFR15PG", 
            "Philco PFR2000P", "Oster OFRT950", "Oster OFRT590-127", "Oster OFRT660", "Oster CKSTAFOV3-017", "Polishop RI9270", 
            "Polishop RI9252", "Polishop RI9201", "Polishop RI9255", "Polishop RI9280", "Polishop RI9217"};
        String[] maquinasDeLavar = {"Electrolux LED15", "Electrolux LED13", "Electrolux LAC11", "Electrolux LAC09", "Electrolux LSP11", 
            "Electrolux LFE11", "Electrolux LEI18", "Electrolux LAC12", "Electrolux LEV17", "Electrolux LEJ14", "Electrolux LSW11",
            "Brastemp BWK12B9", "Brastemp BWK14BB", "Brastemp BWK14AB", "Brastemp BWK16AB", "Brastemp BWK12AB", "Brastemp BWR12AB",
            "Brastemp BWD16A9", "Brastemp BWR12BB", "Brastemp BWH15AB", "Brastemp BNF09AB", "Consul CWK17AB", "Consul CWH12BB", 
            "Consul CWB09BB", "Consul CWH15AB", "Consul CWH12AB", "Consul CWL16AB", "Panasonic F180P7T"};
        
        String type = typeChoice.getValue();
        leftListView.getItems().clear();
        rightListView.getItems().clear();
        switch (type) {
            case "Geladeira":
                leftListView.getItems().addAll(geladeiras);
                rightListView.getItems().addAll(geladeiras);
                break;
            case "Microondas":
                leftListView.getItems().addAll(microondas);
                rightListView.getItems().addAll(microondas);
                break;
            case "Liquidificador":
                leftListView.getItems().addAll(liquidificadores);
                rightListView.getItems().addAll(liquidificadores);
                break;
            case "Air Frier":
                leftListView.getItems().addAll(airFriers);
                rightListView.getItems().addAll(airFriers);
                break;
            case "Maquina de lavar":
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
                break;
            case "Microondas": 
                System.out.println("Escolheu microondas");  
                List<Microondas> microondasArray = Microondas.createList();
                    System.out.println(microondasArray.get(0));
                    System.out.println((microondasArray.get(0)).getFinalName());

                    Microondas microondasSelecionadaEsquerda = new Microondas("placeHolder left");
                    Microondas microondasSelecionadaDireita = new Microondas("placeHolder right");

    //Processo de pegar as instâncias das selecionadas;
                    System.out.println("Para comparar esquerda: " + leftEletroName);
                    System.out.println("Para comparar direita: " + rightEletroName);
                    for (Microondas std : microondasArray) {
                        System.out.println("Valor atual: " + std.getFinalName());
                        if ((std.getFinalName()).equalsIgnoreCase(leftEletroName)) {
                            microondasSelecionadaEsquerda = std; 
                            System.out.println("Esquerda:" + microondasSelecionadaEsquerda.getFinalName());
                        }
                        if ((std.getFinalName()).equalsIgnoreCase(rightEletroName)) {
                            microondasSelecionadaDireita = std;    
                            System.out.println("Direita: " + microondasSelecionadaDireita.getFinalName());
                        }
                    }
                    TelaComparacaoController.comparar(microondasSelecionadaEsquerda, microondasSelecionadaDireita, type);
                    break;
            case "Liquidificador":
                System.out.println("Escolheu liquidificador");
                List<Liquidificador> liquidificadorArray = Liquidificador.createList();
                    System.out.println(liquidificadorArray.get(0));
                    System.out.println((liquidificadorArray.get(0)).getFinalName());
                    
                    Liquidificador liquidificadorSelecionadaEsquerda = new Liquidificador("placeHolder left");
                    Liquidificador liquidificadorSelecionadaDireita = new Liquidificador("placeHolder right");
    //Processo de pegar as instâncias das selecionadas;
                    System.out.println("Para comparar esquerda: " + leftEletroName);
                    System.out.println("Para comparar direita: " + rightEletroName);
                    for (Liquidificador std : liquidificadorArray) {
                        System.out.println("Valor atual: " + std.getFinalName());
                        if ((std.getFinalName()).equalsIgnoreCase(leftEletroName)) {
                            liquidificadorSelecionadaEsquerda = std; 
                            System.out.println("Esquerda:" + liquidificadorSelecionadaEsquerda.getFinalName());
                        }
                        if ((std.getFinalName()).equalsIgnoreCase(rightEletroName)) {
                            liquidificadorSelecionadaDireita = std;    
                            System.out.println("Direita: " + liquidificadorSelecionadaDireita.getFinalName());
                        }
                    }
                    TelaComparacaoController.comparar(liquidificadorSelecionadaEsquerda, liquidificadorSelecionadaDireita, type);
                    break;
            case "Air Frier":
                System.out.println("Escolheu Air Frier");
                List<AirFrier> airFrierArray = AirFrier.createList();
                    System.out.println(airFrierArray.get(0));
                    System.out.println((airFrierArray.get(0)).getFinalName());
                    
                    AirFrier airFrierSelecionadaEsquerda = new AirFrier("placeHolder left");
                    AirFrier airFrierSelecionadaDireita = new AirFrier("placeHolder right");
                    
    //Processo de pegar as instâncias das selecionadas;
                    System.out.println("Para comparar esquerda: " + leftEletroName);
                    System.out.println("Para comparar direita: " + rightEletroName);
                    
                    for (AirFrier std : airFrierArray) {
                        System.out.println("Valor atual: " + std.getFinalName());
                        if ((std.getFinalName()).equalsIgnoreCase(leftEletroName)) {
                            airFrierSelecionadaEsquerda = std; 
                            System.out.println("Esquerda:" + airFrierSelecionadaEsquerda.getFinalName());
                        }
                        if ((std.getFinalName()).equalsIgnoreCase(rightEletroName)) {
                            airFrierSelecionadaDireita = std;    
                            System.out.println("Direita: " + airFrierSelecionadaDireita.getFinalName());
                        }
                    }
                    TelaComparacaoController.comparar(airFrierSelecionadaEsquerda, airFrierSelecionadaDireita, type);
                    break;
            case "Maquina de lavar":
                System.out.println("Escolheu Maquina de lavar");
                List<MaquinaDeLavar> maquinaDeLavarArray = MaquinaDeLavar.createList();
                    System.out.println(maquinaDeLavarArray.get(0));
                    System.out.println((maquinaDeLavarArray.get(0)).getFinalName());
                    
                    MaquinaDeLavar maquinaDeLavarSelecionadaEsquerda = new MaquinaDeLavar("placeHolder left");
                    MaquinaDeLavar maquinaDeLavarSelecionadaDireita = new MaquinaDeLavar("placeHolder right");
                    
    //Processo de pegar as instâncias das selecionadas;    
                    System.out.println("Para comparar esquerda: " + leftEletroName);
                    System.out.println("Para comparar direita: " + rightEletroName);
                    
                    for (MaquinaDeLavar std : maquinaDeLavarArray) {
                        System.out.println("Valor atual: " + std.getFinalName());
                        if ((std.getFinalName()).equalsIgnoreCase(leftEletroName)) {
                            maquinaDeLavarSelecionadaEsquerda = std; 
                            System.out.println("Esquerda:" + maquinaDeLavarSelecionadaEsquerda.getFinalName());
                        }
                        if ((std.getFinalName()).equalsIgnoreCase(rightEletroName)) {
                            maquinaDeLavarSelecionadaDireita = std;    
                            System.out.println("Direita: " + maquinaDeLavarSelecionadaDireita.getFinalName());
                        }
                    }
                    TelaComparacaoController.comparar(maquinaDeLavarSelecionadaEsquerda, maquinaDeLavarSelecionadaDireita, type);
                    break;
        }  
    }
        
        
/*--Funcionalidade de pegar as instâncias das que serão comparadas*/ 

    
    @Override public void initialize(URL url, ResourceBundle rb) {
        typeChoice.getItems().addAll(types);
        typeChoice.setOnAction(this::createList);
        typeChoice.setValue(types[0]);
    }
    
}



    


