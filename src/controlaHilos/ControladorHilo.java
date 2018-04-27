
package controlaHilos;


public class ControladorHilo extends Thread {
    
    private int contador;
    private int limiteSegVerde;
    private int limiteSegAmarillo;
    private int limiteSegRojo;

    public ControladorHilo(int numeroInicial,int limiteSegVerde, int limiteSegAmarillo, int limiteSegRojo) {
        this.contador = numeroInicial;
        this.limiteSegVerde = limiteSegVerde;
        this.limiteSegAmarillo = limiteSegAmarillo;
        this.limiteSegRojo = limiteSegRojo;
    }

    
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getLimiteSegVerde() {
        return limiteSegVerde;
    }

    public void setLimiteSegVerde(int limiteSegVerde) {
        this.limiteSegVerde = limiteSegVerde;
    }

    public int getLimiteSegAmarillo() {
        return limiteSegAmarillo;
    }

    public void setLimiteSegAmarillo(int limiteSegAmarillo) {
        this.limiteSegAmarillo = limiteSegAmarillo;
    }

    public int getLimiteSegRojo() {
        return limiteSegRojo;
    }

    public void setLimiteSegRojo(int limiteSegRojo) {
        this.limiteSegRojo = limiteSegRojo;
    }
    
    
    
    
}
