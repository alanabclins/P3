package Empregado.ClassEmprego;

public class Horista {
    protected double precoHora;
    protected double horasTrabalhadas;
    
    public double vencimento (){
        return precoHora*horasTrabalhadas;
    }
    public Horista(double precoHora, double horasTrabalhadas) {
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getPrecoHora() {
        return precoHora;
    }
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
}
