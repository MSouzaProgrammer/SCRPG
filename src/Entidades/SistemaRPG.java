package Entidades;

import Enum.Naipe;

public class SistemaRPG {

    private Naipe naipe;
    private Integer bonus;
    private Baralho baralho;
    private Carta carta;

    public SistemaRPG(){}
    public SistemaRPG(Naipe naipe, Integer bonus){
        this.naipe = naipe;
        this.bonus = bonus;
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
        if(!baralho.getEmbaralhado()){
            baralho.embaralhar();
        }

        carta =  baralho.puxarCarta();
        if(naipe == carta.getNaipe()){
            carta.somarValor(bonus);
        }
        if(baralho == null){
            return null;
        }
        return carta;
    }
}
