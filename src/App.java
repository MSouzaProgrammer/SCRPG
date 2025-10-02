import Entidades.Baralho;
import Entidades.Carta;
import Entidades.SistemaRPG;
import Enum.Naipe;

public class App {
    public static void main(String[] args) throws Exception {
        
        Baralho baralho = new Baralho();
        SistemaRPG jogador = new SistemaRPG(Naipe.COPAS, 3, baralho);
        for(int i = 0; i < 53; i++){
            Carta carta = jogador.jogar();
            if(carta != null){
                System.out.println("Carta puxada: " + carta + " " + ", valor final: " + jogador.somar());
            }
            else{
                System.out.println("Acabaram as cartas");
                break;
            }
        }
        
        // Testa reset do baralho
        baralho.resetar();
        System.out.println("Baralho resetado, cartas disponíveis: " + baralho.tamanhoBaralho());
    }
}