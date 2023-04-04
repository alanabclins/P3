package uber;

public class motorista extends pessoa {
    private double saldo;
    public static final  int bandeira = 2;

    public motorista(String nome, String nota, double saldo) {
        super(nome, nota);
        this.saldo = saldo;
    }
    
    public void aceitarCorrida(char a,double distancia){
        if(a=='s'){
            this.saldo=this.saldo+ (distancia*bandeira);
            System.out.println("Novo valor de saldo:  "+ getSaldo());
        } else {
            System.out.println("Corrida não aceita");
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public static int getBandeira() {
        return bandeira;
        
    }
    
}
