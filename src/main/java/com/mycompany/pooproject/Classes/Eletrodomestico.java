
package com.mycompany.pooproject.Classes;

import java.net.URL;
import javafx.css.CompoundSelector;

public class Eletrodomestico {
    private String modelo;
    private String marca;
    private String cor;
    private double peso;
    private double volume;
    private double eficiência;
    private double preço;
    
    public Eletrodomestico(String modelo, String marca, String cor, double peso, double volume, double eficiencia, double preço) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.peso = peso;
        this.volume = volume;
        this.eficiência = eficiencia;
        this.preço = preço;
    }
    public Eletrodomestico() {
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
    public double getPeso() {
        return peso;
    }
    public double getVolume() {
        return volume;
    }
    public double getEficiência() {
        return eficiência;
    }
    public double getPreço() {
        return preço;
    }
    
    
    
    
    
    
    
    
    public String getFinalName() {
        String finalName = marca + " " + modelo;
        return finalName;
    }
    public String toString() {
        String finalName = "Marca: " + marca + " Modelo: " + modelo + " Cor: " + cor + " Peso: " + peso + " Volume: " + volume + " Eficiência: " + eficiência + " Preço: " + preço;
        return finalName;
    }
}
