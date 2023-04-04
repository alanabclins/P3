import Bases.SistemaBanco;

public class poupanca extends SistemaBanco{

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

    public poupanca(int agencia, int numDaConta, String nome, int cpf, String endereco, double saldo, int diaRend) {
        super(agencia, numDaConta, nome, cpf, endereco, saldo);
        this.diaRend = diaRend;
    }
     
    
    }
    
