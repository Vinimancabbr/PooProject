/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooproject;

import com.mycompany.pooproject.Classes.Eletrodomestico;
import com.mycompany.pooproject.Classes.Geladeira;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class TelaComparacaoController implements Initializable {
    /*--ListView Esquerda--*/
    @FXML private Label modeloLeft;
    @FXML private Label marcaLeft;
    @FXML private Label corLeft;
    @FXML private Label volumeLeft;
    @FXML private Label eficiênciaLeft;
    @FXML private Label preçoLeft;
    @FXML private Label adaptableLeft1;
    @FXML private Label adaptableLeft2;
    @FXML private Label adaptableLeft3;
    @FXML private Label adaptableLeft4;
    
    /*--ListView Direita--*/
    @FXML private Label modeloRight;
    @FXML private Label marcaRight;
    @FXML private Label corRight;
    @FXML private Label volumeRight;
    @FXML private Label eficiênciaRight;
    @FXML private Label preçoRight;
    @FXML private Label adaptableRight1;
    @FXML private Label adaptableRight2;
    @FXML private Label adaptableRight3;
    @FXML private Label adaptableRight4;
    
    private static TelaComparacaoController telaComparacaoController;

    static public void comparar(Eletrodomestico eletroEsquerda, Eletrodomestico eletroDireita, String type) {

        System.out.println("eletro1: " + eletroEsquerda.getFinalName());
        System.out.println("eletro2: " + eletroDireita.getFinalName());
        
        /*--Colocando todos os valores--*/
        telaComparacaoController.modeloLeft.setText("Modelo: " + eletroEsquerda.getModelo());
        telaComparacaoController.marcaLeft.setText("Marca: " + eletroEsquerda.getMarca());
        telaComparacaoController.corLeft.setText("Cor: " + eletroEsquerda.getCor());
        telaComparacaoController.volumeLeft.setText("Volume: " + Float.toString(eletroEsquerda.getVolume()));
        telaComparacaoController.eficiênciaLeft.setText("Eficiência: " + Float.toString(eletroEsquerda.getEficiência()) + "Wh");
        telaComparacaoController.preçoLeft.setText("Preço: " + Float.toString(eletroEsquerda.getPreço()) + "R$");
        
        telaComparacaoController.modeloRight.setText("Modelo: " + eletroDireita.getModelo());
        telaComparacaoController.marcaRight.setText("Marca: " + eletroDireita.getMarca());
        telaComparacaoController.corRight.setText("Cor: " + eletroDireita.getCor());
        telaComparacaoController.volumeRight.setText("Volume: " + Float.toString(eletroDireita.getVolume()));
        telaComparacaoController.eficiênciaRight.setText("Eficiência: " + Float.toString(eletroDireita.getEficiência()) + "Wh");
        telaComparacaoController.preçoRight.setText("Preço: " + Float.toString(eletroDireita.getPreço()) + "R$");
        
        /*--Colocando valores específicos de classe--*/
        if (eletroEsquerda instanceof Geladeira && eletroDireita instanceof Geladeira) {
            telaComparacaoController.adaptableLeft1.setText("Dimensão: " + ((Geladeira) eletroEsquerda).getDimensão());
            String frostFreeLeft = ((Geladeira) eletroEsquerda).getFrostFree() ? "Sim" : "Não";
            telaComparacaoController.adaptableLeft2.setText("FrostFree: " + frostFreeLeft);
            
            telaComparacaoController.adaptableRight1.setText("Dimensão: " + ((Geladeira) eletroDireita).getDimensão());
            String frostFreeRight = ((Geladeira) eletroDireita).getFrostFree() ? "Sim" : "Não";
            telaComparacaoController.adaptableRight2.setText("FrostFree: " + frostFreeRight);
            
        //Comparando Valores Específicos
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
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        telaComparacaoController = this;
    }
    
}
