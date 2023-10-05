/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooproject;

import com.mycompany.pooproject.Classes.Eletrodomestico;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class TelaComparacaoController implements Initializable {

    static public void comparar(Eletrodomestico geladeiraSelecionadaEsquerda, Eletrodomestico geladeiraSelecionadaDireita) {
        System.out.println("eletro1: " + geladeiraSelecionadaEsquerda.getFinalName());
        System.out.println("eletro2: " + geladeiraSelecionadaDireita.getFinalName());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
}
