public class contato extends contatoBasico {
    private String datansc;
    private int idade;
    public contato(String numero, String tipo, String nome, String datansc, int idade) {
        super(numero, tipo, nome);
        this.datansc = datansc;
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    
    @Override
    public void getDados(){
        super.getDados();
        System.out.print("data: " + datansc + ", idade=" + idade + ".");
    }
    
    

}
