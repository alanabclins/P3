

public class Agenda {
    private String nome;
    private int pos;
    private String email;
    private String palavraChave;
    public Agenda(String nome, String email, String palavraChave,int pos) {

        this.nome = nome;
        this.pos = pos;
        this.email = email;
        this.palavraChave = palavraChave;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPos() {
        return pos;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPalavraChave() {
        return palavraChave;
    }
    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }
    
    @Override
    public String toString() {
        return "Agenda [nome=" + nome + ", pos=" + pos + ", email=" + email + ", palavraChave=" + palavraChave + "]";
    }
    public static void buscarNome(String s, Agenda a []){
        boolean encontrado=false;
        for (int i = 0; i <= a.length-1; i++) {
                  if(s.equals(a[i].nome)){
                      System.out.println("Encontrado na posição "+ i);
                      encontrado=true;
                      
                  }
                }
                if (encontrado == false) {
                    System.out.println("Nome não encontrado");
                }
        
    }
    public static void buscarEmails (String s , Agenda [ ]a ){
        boolean encontrado=false;
        int tam=a.length;
       for (int i = 0; i<tam;i++) {
                 if(s.equals(a[i].email) ) { 
                     System.out.println("Encontrado na posição "+ i);
                     encontrado=true;
                     
                 }
               }
               if (encontrado==false) {
                   System.out.println("Email nao encontrado");
               }
   }

   public static void buscarGeral(String s, Agenda [] a ){
    boolean encontrado=false;
   for (int i = 0; i <= a.length -1;i++) {
             if(s.equals(a[i].palavraChave) ) { 
                 System.out.println("Encontrado na posição "+ i);
                 encontrado=true;
                 
             }
           }
           if (encontrado==false) {
               System.out.println("Palavra chave não encontrada");
           }
}

public static void buscarPos (int p, Agenda [] a){
    boolean encontrado=false;
   for (int i = 0; i <= a.length-1;  i++){
             if(p==a[i].pos)  {
                 System.out.println(" Posição encontrada") ;
                 encontrado=true;
                 
             }
           }
           if (encontrado==false) {
               System.out.println("Email nao encontrado");
           }
}


    
}