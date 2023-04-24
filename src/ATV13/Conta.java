package ATV13;
public class Conta extends ContaGeral{
    protected int agencia;
    protected int numDaConta;
    protected String nome;
    protected int cpf;
    protected String endereco;
    protected double saldo;
    
    public double depositar (double value){
        this.saldo= saldo +value;
       return saldo;
    }

    public Conta (int agencia, int numDaConta, String nome, int cpf, String endereco, double saldo) {
        this.agencia = agencia;
        this.numDaConta = numDaConta;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.saldo = saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumDaConta() {
        return numDaConta;
    }
    public void setNumDaConta(int numDaConta) {
        this.numDaConta = numDaConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public double sacar(double value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

}