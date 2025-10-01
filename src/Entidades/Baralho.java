package Entidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Enum.Naipe;

public class Baralho {
    private List<Carta> baralho = new ArrayList<>();
    private Carta carta;
    private Naipe naipe;

    public Baralho(){
        for (Naipe n : Naipe.values()){
            for(int v = 1; v <=13; v++){
                baralho.add(new Carta(n,v));
            }
        }
    }

    public List<Carta> embaralhar(){
        Collections.shuffle(baralho);
        return baralho;
    }

    public Carta puxarCarta(){
        if(!baralho.isEmpty()){
            return baralho.removeLast();
        }
        return null;
    }
    
}