/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooproject;

import com.mycompany.pooproject.Classes.AirFrier;
import com.mycompany.pooproject.Classes.Eletrodomestico;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TelaComparacaoController implements Initializable {
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
        stage.show();
        }
    
    
    
    
    
    /*--ListView Esquerda--*/
    @FXML private Label finalNameLeft;
    @FXML private ImageView leftImage;
    @FXML private Label modeloLeft;
    @FXML private Label marcaLeft;
    @FXML private Label voltagemLeft;
    @FXML private Label corLeft;
    @FXML private Label volumeLeft;
    @FXML private Label eficiênciaLeft;
    @FXML private Label preçoLeft;
    @FXML private Label pesoLeft;
    @FXML private Label dimensaoLeft;
    @FXML private Label adaptableLeft1;
    @FXML private Label adaptableLeft2;
    @FXML private Label adaptableLeft3;
    @FXML private Label adaptableLeft4;
    
    /*--ListView Direita--*/
    @FXML private Label finalNameRight;
    @FXML private ImageView rightImage;
    @FXML private Label modeloRight;
    @FXML private Label marcaRight;
    @FXML private Label voltagemRight;
    @FXML private Label corRight;
    @FXML private Label volumeRight;
    @FXML private Label eficiênciaRight;
    @FXML private Label preçoRight;
    @FXML private Label pesoRight;
    @FXML private Label dimensaoRight;
    @FXML private Label adaptableRight1;
    @FXML private Label adaptableRight2;
    @FXML private Label adaptableRight3;
    @FXML private Label adaptableRight4;
    
    private static TelaComparacaoController telaComparacaoController;

    static public void comparar(Eletrodomestico eletroEsquerda, Eletrodomestico eletroDireita, String type) {
        
        Image imagemIconeEsquerda = new Image("/Imagens/" + eletroEsquerda.getImageName() + ".jpg");
        Image imagemIconeDireita = new Image("/Imagens/" + eletroDireita.getImageName() + ".jpg");
        
        telaComparacaoController.leftImage.setImage(imagemIconeEsquerda);
        telaComparacaoController.rightImage.setImage(imagemIconeDireita);
        
        telaComparacaoController.leftImage.setPreserveRatio(true);
        telaComparacaoController.rightImage.setPreserveRatio(true);
        
        telaComparacaoController.finalNameLeft.setText(eletroEsquerda.getFinalName());
        telaComparacaoController.finalNameRight.setText(eletroDireita.getFinalName());

        System.out.println("eletro1: " + eletroEsquerda.getFinalName());
        System.out.println("eletro2: " + eletroDireita.getFinalName());
        
        /*--Colocando todos os valores--*/
        telaComparacaoController.modeloLeft.setText("Modelo: " + eletroEsquerda.getModelo());
        telaComparacaoController.marcaLeft.setText("Marca: " + eletroEsquerda.getMarca());
        telaComparacaoController.voltagemLeft.setText("Voltagem: " + eletroEsquerda.getVoltagem() + " V");
        telaComparacaoController.corLeft.setText("Cor: " + eletroEsquerda.getCor());
        telaComparacaoController.volumeLeft.setText("Volume: " + Double.toString(eletroEsquerda.getVolume()) + "L");
        telaComparacaoController.eficiênciaLeft.setText("Eficiência: " + Double.toString(eletroEsquerda.getEficiência()) + " KWh");
        telaComparacaoController.preçoLeft.setText("Preço: " + Double.toString(eletroEsquerda.getPreço()) + " R$");
        telaComparacaoController.pesoLeft.setText("Peso: " + Double.toString(eletroEsquerda.getPeso()) + " Kg");
        telaComparacaoController.dimensaoLeft.setText("Dimensão: " + eletroEsquerda.getDimensão() + " cm");
        
        telaComparacaoController.modeloRight.setText("Modelo: " + eletroDireita.getModelo());
        telaComparacaoController.marcaRight.setText("Marca: " + eletroDireita.getMarca());
        telaComparacaoController.voltagemRight.setText("Voltagem: " + eletroDireita.getVoltagem() + " V");
        telaComparacaoController.corRight.setText("Cor: " + eletroDireita.getCor());
        telaComparacaoController.volumeRight.setText("Volume: " + Double.toString(eletroDireita.getVolume()));
        telaComparacaoController.eficiênciaRight.setText("Eficiência: " + Double.toString(eletroDireita.getEficiência()) + " KWh");
        telaComparacaoController.preçoRight.setText("Preço: " + Double.toString(eletroDireita.getPreço()) + " R$");
        telaComparacaoController.pesoRight.setText("Peso: " + Double.toString(eletroDireita.getPeso()) + " Kg");
        telaComparacaoController.dimensaoRight.setText("Dimensão: " + eletroDireita.getDimensão() + " cm");
        
        /*--Colocando valores específicos de classe e Comparando Valores Específicos--*/
        if (eletroEsquerda instanceof Geladeira && eletroDireita instanceof Geladeira) {
            telaComparacaoController.adaptableLeft1.setText("Dimensão: " + ((Geladeira) eletroEsquerda).getDimensão());
            String frostFreeLeft = ((Geladeira) eletroEsquerda).getFrostFree() ? "Sim" : "Não";
            telaComparacaoController.adaptableLeft2.setText("FrostFree: " + frostFreeLeft);
            
            telaComparacaoController.adaptableRight1.setText("Dimensão: " + ((Geladeira) eletroDireita).getDimensão());
            String frostFreeRight = ((Geladeira) eletroDireita).getFrostFree() ? "Sim" : "Não";
            telaComparacaoController.adaptableRight2.setText("FrostFree: " + frostFreeRight);
            
            if (((Geladeira) eletroEsquerda).getFrostFree() == ((Geladeira) eletroDireita).getFrostFree()) {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.BLUE);
                telaComparacaoController.adaptableRight2.setTextFill(Color.BLUE);
            } else if (((Geladeira) eletroEsquerda).getFrostFree()) {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.GREEN);
                telaComparacaoController.adaptableRight2.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.RED);
                telaComparacaoController.adaptableRight2.setTextFill(Color.GREEN);
            }
        } else if (eletroEsquerda instanceof  Microondas && eletroDireita instanceof Microondas) {
            telaComparacaoController.adaptableLeft1.setText("Diferencial: " + ((Microondas) eletroEsquerda).getDiferencial());
            telaComparacaoController.adaptableRight1.setText("Diferencial: " + ((Microondas) eletroDireita).getDiferencial());
            if (((Microondas) eletroEsquerda).getDiferencial().equalsIgnoreCase("Nenhum")) {
                telaComparacaoController.adaptableLeft1.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableLeft1.setTextFill(Color.GREEN);
            }
            
            if (((Microondas) eletroDireita).getDiferencial().equalsIgnoreCase("Nenhum")) {
                telaComparacaoController.adaptableRight1.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableRight1.setTextFill(Color.GREEN);
            }
        } else if (eletroEsquerda instanceof  Liquidificador && eletroDireita instanceof Liquidificador) {
            telaComparacaoController.adaptableLeft1.setText("Diferencial: " + ((Liquidificador) eletroEsquerda).getDiferencial());
            telaComparacaoController.adaptableRight1.setText("Diferencial: " + ((Liquidificador) eletroDireita).getDiferencial());
            telaComparacaoController.adaptableLeft2.setText("Potência: " + ((Liquidificador) eletroEsquerda).getPotência());
            telaComparacaoController.adaptableRight2.setText("Potência: " + ((Liquidificador) eletroDireita).getPotência());
            
            if (((Liquidificador) eletroEsquerda).getDiferencial().equalsIgnoreCase("Nenhum")) {
                telaComparacaoController.adaptableLeft1.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableLeft1.setTextFill(Color.GREEN);
            }
            
            if (((Liquidificador) eletroDireita).getDiferencial().equalsIgnoreCase("Nenhum")) {
                telaComparacaoController.adaptableRight1.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableRight1.setTextFill(Color.GREEN);
            }
            
            if (((Liquidificador) eletroEsquerda).getPotência() < ((Liquidificador) eletroDireita).getPotência()) {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.RED);
                telaComparacaoController.adaptableRight2.setTextFill(Color.GREEN);
            } else if (((Liquidificador) eletroEsquerda).getPotência() > ((Liquidificador) eletroDireita).getPotência()) {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.GREEN);
                telaComparacaoController.adaptableRight2.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.BLUE);
                telaComparacaoController.adaptableRight2.setTextFill(Color.BLUE);
            }
        } else if (eletroEsquerda instanceof AirFrier && eletroDireita instanceof AirFrier) {
            telaComparacaoController.adaptableLeft1.setText("Tipo: " + ((AirFrier) eletroEsquerda).getTipo());
            telaComparacaoController.adaptableRight1.setText("Tipo: " + ((AirFrier) eletroDireita).getTipo());
            telaComparacaoController.adaptableLeft2.setText("Potência: " + ((AirFrier) eletroEsquerda).getPotência());
            telaComparacaoController.adaptableRight2.setText("Potência: " + ((AirFrier) eletroDireita).getPotência());
            
            if (((AirFrier) eletroEsquerda).getPotência() < ((AirFrier) eletroDireita).getPotência()) {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.RED);
                telaComparacaoController.adaptableRight2.setTextFill(Color.GREEN);
            } else if (((AirFrier) eletroEsquerda).getPotência() > ((AirFrier) eletroDireita).getPotência()) {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.GREEN);
                telaComparacaoController.adaptableRight2.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.BLUE);
                telaComparacaoController.adaptableRight2.setTextFill(Color.BLUE);
            }   
        } else if (eletroEsquerda instanceof MaquinaDeLavar && eletroDireita instanceof MaquinaDeLavar) {
            telaComparacaoController.adaptableLeft1.setText("Diferencial: " + ((MaquinaDeLavar) eletroEsquerda).getDiferencial());
            telaComparacaoController.adaptableRight1.setText("Diferencial: " + ((MaquinaDeLavar) eletroDireita).getDiferencial());
            telaComparacaoController.adaptableLeft2.setText("Litro: " + ((MaquinaDeLavar) eletroEsquerda).getLitro());
            telaComparacaoController.adaptableRight2.setText("Litro: " + ((MaquinaDeLavar) eletroDireita).getLitro());
            if (((MaquinaDeLavar) eletroEsquerda).getDiferencial().equalsIgnoreCase("Nenhum")) {
                telaComparacaoController.adaptableLeft1.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableLeft1.setTextFill(Color.GREEN);
            }
            
            if (((MaquinaDeLavar) eletroDireita).getDiferencial().equalsIgnoreCase("Nenhum")) {
                telaComparacaoController.adaptableRight1.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableRight1.setTextFill(Color.GREEN);
            }
            
            if (((MaquinaDeLavar) eletroEsquerda).getLitro() < ((MaquinaDeLavar) eletroDireita).getLitro()) {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.RED);
                telaComparacaoController.adaptableLeft2.setTextFill(Color.GREEN);
            } else if (((MaquinaDeLavar) eletroEsquerda).getLitro() > ((MaquinaDeLavar) eletroDireita).getLitro()) {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.GREEN);
                telaComparacaoController.adaptableLeft2.setTextFill(Color.RED);
            } else {
                telaComparacaoController.adaptableLeft2.setTextFill(Color.BLUE);
                telaComparacaoController.adaptableLeft2.setTextFill(Color.BLUE);
            }
        }
        
        
        /*--Comparando os valores gerais--*/
        //Volume
        if (eletroEsquerda.getVolume() > eletroDireita.getVolume()) {
            telaComparacaoController.volumeLeft.setTextFill(Color.GREEN);
            telaComparacaoController.volumeRight.setTextFill(Color.RED);
        } else if (eletroEsquerda.getVolume() < eletroDireita.getVolume()) {
            telaComparacaoController.volumeLeft.setTextFill(Color.RED);
            telaComparacaoController.volumeRight.setTextFill(Color.GREEN);
        } else {
            telaComparacaoController.volumeLeft.setTextFill(Color.BLUE);
            telaComparacaoController.volumeRight.setTextFill(Color.BLUE);
        }
        //Eficiência
        if (eletroEsquerda.getEficiência()> eletroDireita.getEficiência()) {
            telaComparacaoController.eficiênciaLeft.setTextFill(Color.GREEN);
            telaComparacaoController.eficiênciaRight.setTextFill(Color.RED);
        } else if (eletroEsquerda.getEficiência()< eletroDireita.getEficiência()) {
            telaComparacaoController.eficiênciaLeft.setTextFill(Color.RED);
            telaComparacaoController.eficiênciaRight.setTextFill(Color.GREEN);
        } else {
            telaComparacaoController.eficiênciaLeft.setTextFill(Color.BLUE);
            telaComparacaoController.eficiênciaRight.setTextFill(Color.BLUE);
        }
        //Preço
        if (eletroEsquerda.getPreço() < eletroDireita.getPreço()) {
            telaComparacaoController.preçoLeft.setTextFill(Color.GREEN);
            telaComparacaoController.preçoRight.setTextFill(Color.RED);
        } else if (eletroEsquerda.getPreço()> eletroDireita.getPreço()) {
            telaComparacaoController.preçoLeft.setTextFill(Color.RED);
            telaComparacaoController.preçoRight.setTextFill(Color.GREEN);
        } else {
            telaComparacaoController.preçoLeft.setTextFill(Color.BLUE);
            telaComparacaoController.preçoRight.setTextFill(Color.BLUE);
        }   
        //Peso
        if (eletroEsquerda.getPeso() > eletroDireita.getPeso()) {
            telaComparacaoController.pesoLeft.setTextFill(Color.GREEN);
            telaComparacaoController.pesoRight.setTextFill(Color.RED);
        } else if (eletroEsquerda.getPeso()< eletroDireita.getPeso()) {
            telaComparacaoController.pesoLeft.setTextFill(Color.RED);
            telaComparacaoController.pesoRight.setTextFill(Color.GREEN);
        } else {
            telaComparacaoController.pesoLeft.setTextFill(Color.BLUE);
            telaComparacaoController.pesoRight.setTextFill(Color.BLUE);
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        telaComparacaoController = this;
    }
    
}
