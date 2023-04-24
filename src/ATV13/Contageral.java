package ATV13;

abstract class ContaGeral{
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
    //metodo abstrata:
    public abstract double sacar (double value);

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
}