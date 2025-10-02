package Entidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import Enum.Naipe;

public class Baralho {
    private List<Carta> baralho = new ArrayList<>();
    private Boolean embaralhado = false;

    public Baralho(){
        for (Naipe n : Naipe.values()){
            for(int v = 1; v <=13; v++){
                baralho.add(new Carta(n,v));
            }
        }
    }

    public void resetar(){
        baralho = new ArrayList<>();
        embaralhado = false;
    }

    public Boolean getEmbaralhado(){
        return embaralhado;
    }

    public List<Carta> embaralhar(){
        Collections.shuffle(baralho);
        embaralhado = true;
        return baralho;
    }

    public Carta puxarCarta(){
        if(!baralho.isEmpty()){
            return baralho.removeLast();
        }
        if(baralho.isEmpty()){
           return null; 
        }
        return null;
    }
    
}