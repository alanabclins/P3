public class eContato extends contato {
    public String email;
    public String homepage;
    public String hp;

    public eContato(String numero, String tipo, String nome, String datansc, int idade, String email, String homepage,
            String hp) {
        super(numero, tipo, nome, datansc, idade);
        this.email = email;
        this.homepage = homepage;
        this.hp = hp;
    }
@Override
public void getDados() {
    // TODO Auto-generated method stub
    super.getDados();
    System.out.println("email=" + email + ", homepage=" + homepage + ", hp=" + hp + ".");

}
public String getEmail() {
    return email;
}
public String getHomepage() {
    return homepage;
}


}
