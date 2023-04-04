public class contatoBasico extends telefone{
    private String nome;

    public contatoBasico(String numero, String tipo, String nome) {
        super(numero, tipo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void getDados(){
        System.out.println("Nome: "+nome + getTelefone());
        
    }
}
