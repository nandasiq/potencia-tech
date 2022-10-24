public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirrCanal(){
        canal--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume mais alto: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume mais baixo: " + volume);
    }



}