public class SmartTv {
    Boolean ligada = false;
    int canal = 4;
    int volume = 37;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;

    }

    public void diminuirCanal() {
        canal--;

    }

    public void aumentarCanal() {
        canal++;

    }

    public void aumentarVolume() {
        System.out.println("Aumentando Volume!");
        // volume = volume + 1;
        volume++;
    }

    public void diminuirVolume() {
        // volume = volume - 1;
        volume--;

    }

    public void ligar() {

        ligada = true;
    }

    public void desligar() {

        ligada = false;
    }
}
