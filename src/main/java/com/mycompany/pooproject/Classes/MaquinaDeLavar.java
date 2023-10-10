
package com.mycompany.pooproject.Classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class MaquinaDeLavar extends Eletrodomestico {
    
    private String type;
    private String diferencial;
    private double kilo;
            
    public MaquinaDeLavar(String modelo, String marca, String cor, double peso, double volume, double eficiencia, double preço, String voltagem, String dimensão, String diferencial) {
        super(modelo, marca, cor, peso, volume, eficiencia, preço, voltagem, dimensão);
        this.type = "MaquinaDeLavar";
        this.diferencial = diferencial;
    }  
    public MaquinaDeLavar(String modelo) {
        super(modelo);
    }
    public MaquinaDeLavar() {
        super();
    }
    
    /*--Métodos get--*/
    public String getType() {
        return type;
    }
    public String getDiferencial() {
        return diferencial;
    }
    public double getKilo() {
        return kilo;
    }
    
    
    /*--Método de criar lista de elementos--*/
    static public List createList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<MaquinaDeLavar> maquinaDeLavarArray = objectMapper.readValue(new File("src/main/resources/jsonFiles/maquinaDeLavarJson.json"), new TypeReference<List<MaquinaDeLavar>>() {});
        return maquinaDeLavarArray;
    }
}
