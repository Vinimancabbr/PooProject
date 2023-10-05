
package com.mycompany.pooproject.Classes;

import java.net.URL;

public class Geladeira extends Eletrodomestico {
    
    private String type;
    private String dimensão;
    private boolean FrostFree;
    
    public Geladeira(String modelo, String marca, String cor, float volume, float eficiencia, float preço, String dimensão, boolean FrostFree) {
        super(modelo,marca,cor,volume,eficiencia, preço);
        this.type = "Geladeira";
        this.dimensão = dimensão;
        this.FrostFree = FrostFree;
    }  
    public Geladeira(String modelo) {
        super(modelo);
    }
}
