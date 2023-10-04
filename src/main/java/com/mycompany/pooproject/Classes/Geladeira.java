
package com.mycompany.pooproject.Classes;

import java.net.URL;

public class Geladeira extends Eletrodomestico {
    
    private final String type;
    private final String dimensão;
    private final boolean FrostFree;
    
    public Geladeira(String modelo, String marca, String cor, float volume, float eficiencia, float preço, String dimensão, boolean FrostFree) {
        super(modelo,marca,cor,volume,eficiencia, preço);
        this.type = "Geladeira";
        this.dimensão = dimensão;
        this.FrostFree = FrostFree;
    }  
}
