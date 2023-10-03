
package com.mycompany.pooproject.Classes;

public class Eletrodomestico {
    String modelo;
    
    
    public Eletrodomestico(String novoModelo) {
        modelo = novoModelo;
    }
    
    private void setModelo(String novoModelo) {
        modelo = novoModelo;
    }
    
    private String getModelo() {
        return modelo;
    }
}
