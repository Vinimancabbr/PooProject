
package com.mycompany.pooproject.Classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Geladeira extends Eletrodomestico {
    
    private String type;
    private String dimensão;
    private boolean frostFree;
    
    public Geladeira(String modelo, String marca, String cor, double peso, double volume, double eficiencia, double preço, String voltagem, String dimensão, boolean FrostFree) {
        super(modelo, marca, cor, peso, volume, eficiencia, preço, voltagem, dimensão);
        this.type = "Geladeira";
        this.frostFree = FrostFree;
    }  
    public Geladeira(String modelo) {
        super(modelo);
    }
    public Geladeira() {
        super();
    }
    
    /*--Métodos get--*/
    public String getType() {
        return type;
    }
    public boolean getFrostFree() {
        return frostFree;
    }
    
    
    /*--Método de criar lista de elementos--*/
    static public List createList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Geladeira> geladeiraArray = objectMapper.readValue(new File("src/main/resources/jsonFiles/geladeiraJson.json"), new TypeReference<List<Geladeira>>() {});
        return geladeiraArray;
    }
}
