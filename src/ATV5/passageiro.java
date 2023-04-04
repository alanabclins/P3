package uber;

public class passageiro extends pessoa {
    private String telefone;

    public passageiro(String nome, String nota, String telefone) {
        super(nome, nota);
        this.telefone = telefone;
    }
    public double solicitarCorrida (double a, double b, double c){
        double distancia=calculaDistancia(a, b, c);
        return distancia;
    }
    private double calculaDistancia (double a,double b,double c){
        double delta;
        delta=Math.pow(b,2)-4*a*c;
        if(delta<0){
            return -1;//DELTA NEGATIVO
        } 
        delta= Math.sqrt(delta);
        double resultOne;
        resultOne=((-b)+ delta)/2*a;
        return resultOne;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
  
    
}
