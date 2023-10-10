
package com.mycompany.pooproject.Classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Microondas extends Eletrodomestico {
    
    private String type;
    private String diferencial;
    
    public Microondas(String modelo, String marca, String cor, double peso, double volume, double eficiencia, double preço, String voltagem, String dimensão, String diferencial) {
        super(modelo, marca, cor, peso, volume, eficiencia, preço, voltagem, dimensão);
        this.type = "Microondas";
        this.diferencial = diferencial;
    }  
    public Microondas(String modelo) {
        super(modelo);
    }
    public Microondas() {
        super();
    }
    
    /*--Métodos get--*/
    public String getType() {
        return type;
    }
    public String getDiferencial() {
        return diferencial;
    }
    
    
    /*--Método de criar lista de elementos--*/
    static public List createList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Microondas> microondasArray = objectMapper.readValue(new File("src/main/resources/jsonFiles/microondasJson.json"), new TypeReference<List<Microondas>>() {});
        return microondasArray;
    }
}
