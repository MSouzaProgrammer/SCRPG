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
    public Naipe getNaipe(){
        return naipe;
    }
    public Integer getValor(){
        return valor;
    }
    public Integer somarValor(Integer soma){
        return valor + soma;
    }
    
    @Override
    public String toString() {
         return valor + " de " + naipe;
    }
}
