/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooproject;

import com.mycompany.pooproject.Classes.Eletrodomestico;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class TelaComparacaoController implements Initializable {
    /*--ListView Esquerda--*/
    @FXML private Label modeloLeft;
    @FXML private Label marcaLeft;
    @FXML private Label corLeft;
    @FXML private Label volumeLeft;
    @FXML private Label eficiênciaLeft;
    @FXML private Label preçoLeft;
    
    /*--ListView Direita--*/
    @FXML private Label modeloRight;
    @FXML private Label marcaRight;
    @FXML private Label corRight;
    @FXML private Label volumeRight;
    @FXML private Label eficiênciaRight;
    @FXML private Label preçoRight;
    
    private static TelaComparacaoController telaComparacaoController;

    static public void comparar(Eletrodomestico geladeiraSelecionadaEsquerda, Eletrodomestico geladeiraSelecionadaDireita, String type) {

        System.out.println("eletro1: " + geladeiraSelecionadaEsquerda.getFinalName());
        System.out.println("eletro2: " + geladeiraSelecionadaDireita.getFinalName());
        
        /*--Colocando todos os valores--*/
        telaComparacaoController.modeloLeft.setText("Modelo: " + geladeiraSelecionadaEsquerda.getModelo());
        telaComparacaoController.marcaLeft.setText("Marca: " + geladeiraSelecionadaEsquerda.getMarca());
        telaComparacaoController.corLeft.setText("Cor: " + geladeiraSelecionadaEsquerda.getCor());
        telaComparacaoController.volumeLeft.setText("Volume: " + Float.toString(geladeiraSelecionadaEsquerda.getVolume()));
        telaComparacaoController.eficiênciaLeft.setText("Eficiência: " + Float.toString(geladeiraSelecionadaEsquerda.getEficiência()) + "Wh");
        telaComparacaoController.preçoLeft.setText("Preço: " + Float.toString(geladeiraSelecionadaEsquerda.getPreço()) + "R$");
        
        telaComparacaoController.modeloRight.setText("Modelo: " + geladeiraSelecionadaDireita.getModelo());
        telaComparacaoController.marcaRight.setText("Marca: " + geladeiraSelecionadaDireita.getMarca());
        telaComparacaoController.corRight.setText("Cor: " + geladeiraSelecionadaDireita.getCor());
        telaComparacaoController.volumeRight.setText("Volume: " + Float.toString(geladeiraSelecionadaDireita.getVolume()));
        telaComparacaoController.eficiênciaRight.setText("Eficiência: " + Float.toString(geladeiraSelecionadaDireita.getEficiência()) + "Wh");
        telaComparacaoController.preçoRight.setText("Preço: " + Float.toString(geladeiraSelecionadaDireita.getPreço()) + "R$");
        
  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        telaComparacaoController = this;
    }
    
}
