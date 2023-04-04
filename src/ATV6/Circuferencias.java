package Coordenadas;

public class Circuferencias {
    private int dcp;
    private int raio;
    public int getDcp() {
        return dcp;
    }
    public void setDcp(int dcp) {
        this.dcp = dcp;
    }
    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
    public Circuferencias(int dcp, int raio) {
        this.dcp = dcp;
        this.raio = raio;
    }
    public boolean IsInside(int dcp, int raio){
        if(dcp<raio){
            return true;
        } 
        return false;
    }
}
