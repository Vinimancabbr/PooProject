
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
    private String voltagem;
    private String dimensão;
    
    public Eletrodomestico(String modelo, String marca, String cor, double peso, double volume, double eficiencia, double preço, String voltagem, String dimensão) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.peso = peso;
        this.volume = volume;
        this.eficiência = eficiencia;
        this.preço = preço;
        this.voltagem = voltagem;
        this.dimensão = dimensão;
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
    public String getVoltagem() {
        return voltagem;
    }
    public String getDimensão() {
        return dimensão;
    }
    
    public String getFinalName() {
        String finalName = marca + " " + modelo;
        return finalName;
    }
    
    public String getImageName() {
        String imageName = marca + modelo;
        return imageName;
    }
    public String toString() {
        String finalName = "Marca: " + marca + " Modelo: " + modelo + " Cor: " + cor + " Peso: " + peso + " Volume: " + volume + " Eficiência: " + eficiência + " Preço: " + preço + " Voltagem: " + voltagem;
        return finalName;
    }
}
