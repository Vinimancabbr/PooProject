
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
    private double potência;
    
    public AirFrier(String modelo, String marca, String cor, double peso, double volume, double eficiencia, double preço, String tipo, double potência) {
        super(modelo, marca, cor, peso, volume, eficiencia, preço);
        this.type = "AirFrier";
        this.tipo = tipo;
        this.potência = potência;
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
    public double getPotência() {
        return potência;
    }
    
    
    /*--Método de criar lista de elementos--*/
    static public List createList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<AirFrier> airFrierArray = objectMapper.readValue(new File("src/main/resources/jsonFiles/airFrierJson.json"), new TypeReference<List<AirFrier>>() {});
        return airFrierArray;
    }
}