
package com.mycompany.pooproject.Classes;

import java.net.URL;
import javafx.css.CompoundSelector;

public class Eletrodomestico {
    private final String modelo;
    private final String marca;
    private final String cor;
    private final float volume;
    private final float eficiencia;
    private final float preço;
    
    public Eletrodomestico(String modelo, String marca, String cor, float volume, float eficiencia, float preço) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.volume = volume;
        this.eficiencia = eficiencia;
        this.preço = preço;
    }
    
    public String getFinalName() {
        String finalName = modelo + " -- " + marca;
        return finalName;
    }
}
