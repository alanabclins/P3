public class telefone {
    private String numero;
    private String tipo;
    public telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    public String getTelefone() {
        String ret= this.numero + " "+ this.tipo;
        return ret;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
