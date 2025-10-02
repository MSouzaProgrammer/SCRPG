package Entidades;

import Enum.Naipe;

public class SistemaRPG {

    private Naipe naipe;
    private Integer bonus;
    private Baralho baralho;
    private Carta carta;


    public SistemaRPG(){}
    public SistemaRPG(Naipe naipe, Integer bonus, Baralho baralho){
        this.naipe = naipe;
        this.bonus = bonus;
        this.baralho = baralho;
    }
    public Naipe getNaipe() {
        return naipe;
    }
    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }
    public Integer getBonus() {
        return bonus;
    }
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Carta jogar(){
        if(baralho == null){
            return null;
        }
        
        if(!baralho.getEmbaralhado()){
            baralho.embaralhar();
        }

        carta = baralho.puxarCarta();
        return carta;
    }

    public Integer somar(){
        if(carta == null){
            return null;
        }
        if(naipe == carta.getNaipe()){
            return carta.somarValor(bonus);
        }
        return carta.getValor();
    }
}
