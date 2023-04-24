package ATV13;

public class poupanca extends  Conta {
    protected int diaRend;
    
    public poupanca(int agencia, int numDaConta, String nome, int cpf, String endereco, double saldo, int diaRend) {
        super(agencia, numDaConta, nome, cpf, endereco, saldo);
        this.diaRend=diaRend;
    }
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
        return saldo-value;
    }
    
}
