import Bases.SistemaBanco;

public class ContaEspecial extends SistemaBanco {
     protected double limite;

    public ContaEspecial(int agencia, int numDaConta, String nome, int cpf, String endereco, double saldo) {
        super(agencia, numDaConta, nome, cpf, endereco, saldo);
        this.limite = 100;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
     public double saqueEspecial (double value){
        this.saldo= saldo -value;
        if(this.saldo<saldo-100){
            return -1;
        }
       return saldo;
    }
}
