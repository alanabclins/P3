public class contatoComercial extends contatoBasico {
    private String atividade;
    private String funcionario;
    public contatoComercial(String numero, String tipo, String nome, String atividade, String funcionario) {
        super(numero, tipo, nome);
        this.atividade = atividade;
        this.funcionario = funcionario;
    }
    @Override
    public void getDados() {
        // TODO Auto-generated method stub
        super.getDados();
        System.out.println("atividade=" + atividade + ", funcionario=" + funcionario + ".");
    }
    
}
