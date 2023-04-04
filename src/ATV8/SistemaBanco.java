package Codes;
public class SistemaBanco {
    private int agencia;
    private int numDaConta;
    private String nome;
    private int cpf;
    private String endereco;
    private double saldo;
    
    public double depositar (double value){
        this.saldo= saldo +value;
       return saldo;
    }
    public double sacar (double value){
        this.saldo= saldo -value;
        if(this.saldo<0){
            return -1;
        }
       return saldo;
    }

    public SistemaBanco(int agencia, int numDaConta, String nome, int cpf, String endereco, double saldo) {
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
    
}
