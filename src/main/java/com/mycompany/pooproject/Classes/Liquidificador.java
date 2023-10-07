
package com.mycompany.pooproject.Classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Liquidificador extends Eletrodomestico {
    
    private String type;
    private String diferencial;
    private double potência;
    
    public Liquidificador(String modelo, String marca, String cor, double peso, double volume, double eficiencia, double preço, String diferencial, double potência) {
        super(modelo, marca, cor, peso, volume, eficiencia, preço);
        this.type = "Liquidifcador";
        this.diferencial = diferencial;
        this.potência = potência;
    }  
    public Liquidificador(String modelo) {
        super(modelo);
    }
    public Liquidificador() {
        super();
    }
    
    /*--Métodos get--*/
    public String getType() {
        return type;
    }
    public String getDiferencial() {
        return diferencial;
    }
    public double getPotência() {
        return potência;
    }
    
    
    /*--Método de criar lista de elementos--*/
    static public List createList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Liquidificador> liquidificadorArray = objectMapper.readValue(new File("src/main/resources/jsonFiles/liquidificadorJson.json"), new TypeReference<List<Liquidificador>>() {});
        return liquidificadorArray;
    }
}
