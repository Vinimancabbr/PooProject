
package com.mycompany.pooproject.Classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class AirFrier extends Eletrodomestico {
    
    private String type;
    private String tipo;
    private String diferencial;
    private double potencia;
    
    public AirFrier(String modelo, String marca, String cor, double peso, double volume, double eficiencia, double preço, String voltagem, String dimensão, String tipo, double potencia, String diferencial) {
        super(modelo, marca, cor, peso, volume, eficiencia, preço, voltagem, dimensão);
        this.type = "AirFrier";
        this.tipo = tipo;
        this.potencia = potencia;
        this.diferencial = diferencial;
    }  
    public AirFrier(String modelo) {
        super(modelo);
    }
    public AirFrier() {
        super();
    }
    
    /*--Métodos get--*/
    public String getType() {
        return type;
    }
    public String getTipo() {
        return tipo;
    }
    public double getPotencia() {
        return potencia;
    }
    public String getDiferencial() {
        return diferencial;
    }
    
    
    /*--Método de criar lista de elementos--*/
    static public List createList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<AirFrier> airFrierArray = objectMapper.readValue(new File("src/main/resources/jsonFiles/airFrierJson.json"), new TypeReference<List<AirFrier>>() {});
        return airFrierArray;
    }
}
