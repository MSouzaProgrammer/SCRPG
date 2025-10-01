import Entidades.Baralho;

public class App {
    public static void main(String[] args) throws Exception {
        Baralho baralho = new Baralho();
        baralho.embaralhar();

        System.out.println(baralho.puxarCarta());
        System.out.println(baralho.puxarCarta());
    }
}