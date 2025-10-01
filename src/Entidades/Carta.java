package Entidades;
import Enum.Naipe;

public class Carta {
    private int valor;
    private Naipe naipe;
    
    public Carta(){}
    public Carta(Naipe naipe, int valor){
        this.naipe = naipe;
        this.valor = valor;
    }
        
    @Override
    public String toString() {
         return valor + " de " + naipe;
    }
}
