
package com.mycompany.pooproject.Classes;

import java.net.URL;
import javafx.css.CompoundSelector;

public class Eletrodomestico {
    private String modelo;
    private String marca;
    private String cor;
    private float volume;
    private float eficiência;
    private float preço;
    
    public Eletrodomestico(String modelo, String marca, String cor, float volume, float eficiencia, float preço) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.volume = volume;
        this.eficiência = eficiencia;
        this.preço = preço;
    }
    
    public Eletrodomestico(String modelo) {
        this.modelo = modelo;
    }
    
    /*--Métodos get--*/
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getCor() {
        return cor;
    }
    public Float getVolume() {
        return volume;
    }
    public float getEficiência() {
        return eficiência;
    }
    public float getPreço() {
        return preço;
    }
    
    
    
    
    
    
    
    
    public String getFinalName() {
        String finalName = marca + " " + modelo;
        return finalName;
    }
}
