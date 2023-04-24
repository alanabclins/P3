package ATV13;

public class poupanca extends ContaGeral {
    protected int diaRend;
    
    

    public double atualiza (double rendimento){
        return this.saldo*rendimento;
    }

    public int getDiaRend() {
        return diaRend;
    }

    public void setDiaRend(int diaRend) {
        this.diaRend = diaRend;
    }
    
    @Override
    public double sacar(double value) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }
}
