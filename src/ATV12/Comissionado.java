package Empregado.ClassEmprego;

public class Comissionado {
    protected double totalVenda;
    protected double taxaComissao;
    
    public Comissionado(double totalVenda, double taxaComissao) {
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }
    public double vencimento (){
        return totalVenda*taxaComissao;
    }
    public double getTotalVenda() {
        return totalVenda;
    }
    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }
    public double getTaxaComissao() {
        return taxaComissao;
    }
    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
}
