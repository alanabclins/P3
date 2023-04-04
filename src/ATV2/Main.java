package ATV2;

import java.util.Scanner;

public class Main {
    public static  void mostramenu(){
        System.out.println("1-Cadastrar pessoas");
        System.out.println("2-Mostrar agenda");
        System.out.println("3-Buscar nome");
        System.out.println("4- Buscar Email");
         System.out.println("5- OBter quantidade");
         System.out.println("6- Buscar posição");
         System.out.println("7- Buscar  palavra-chave");
        System.out.println("Outro- Encerrar");
        System.out.println("Digite sua opção:");
    }
    public static void buscarNome(String s, String nomes[]){
        boolean encontrado=false;
        for (int i = 0; i <= nomes.length-1; i++) {
                  if(s.equals(nomes[i])){
                      System.out.println("Encontrado na posição "+ i);
                      encontrado=true;
                      
                  }
                }
                if (encontrado == false) {
                    System.out.println("Nome não encontrado");
                }
        
    }
    public static void buscarEmails (String s , String [] emails){
         boolean encontrado=false;
         int tam=emails.length;
        for (int i = 0; i<tam;i++) {
                  if(s.equals(emails[i]) ) { 
                      System.out.println("Encontrado na posição "+ i);
                      encontrado=true;
                      
                  }
                }
                if (encontrado==false) {
                    System.out.println("Email nao encontrado");
                }
    }
     public static void buscarGeral(String s, String [] pc ){
         boolean encontrado=false;
        for (int i = 0; i <= pc.length -1;i++) {
                  if(s.equals(pc[i]) ) { 
                      System.out.println("Encontrado na posição "+ i);
                      encontrado=true;
                      
                  }
                }
                if (encontrado==false) {
                    System.out.println("Palavra chave não encontrada");
                }
    }
     public static void buscarPos (int p, int [] pos){
         boolean encontrado=false;
        for (int i = 0; i <= pos.length-1;  i++){
                  if(p==pos[i])  {
                      System.out.println(" Posição encontrada") ;
                      encontrado=true;
                      
                  }
                }
                if (encontrado==false) {
                    System.out.println("Email nao encontrado");
                }
    }

    public static void main(String args[]) {
     Scanner s= new Scanner (System.in);
        String a;
        int tam,op,p;
        System.out.println("Quantas pessoas você deseja cadastrar:");
        tam=s.nextInt();
        s.nextLine();
        boolean cont=true;
        String nomes [] = new String[tam];
        String emails[]= new String [tam];
         String[] pc= new String [tam];
        int telefones [] = new int [tam];
        int[] pos = new int [tam];
        int idade [] = new int [tam];
        while (cont==true) {
            mostramenu();
            op=s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
                  for (int i = 0; i <= tam-1; i++) {
                    pos[i]=i;
                    System.out.println("Insira o nome");
                    nomes[i]=s.nextLine();
                    System.out.println("Insira o email");
                    emails[i]=s.nextLine();
                    System.out.println("Insira a palavra chave ") ;
                    pc[i] = s.nextLine() ;
                    System.out.println("Insira o telefone:");
                    telefones[i]=s.nextInt();
                    System.out.println("Insira a idade");
                    idade[i]=s.nextInt();
                    s.nextLine();
                  }
                  
                   
                break;
                    
                case 2:
                for (int i = 0; i <= tam-1; i++) {
                  System.out.println("Dados: " + "nome=" + nomes[i] + ", email=" + emails[i] + ",telefone =" + telefones[i] + " ,idade = "+idade[i]);
                }
                break;
                case 3:
                    System.out.println("Qual nome você deseja procurar?");
                    a=s.nextLine();
                    buscarNome(a,nomes);
                    break;
                case 4:
                    System.out.println("Qual email deseja procurar?");
                    a=s.nextLine();
                    buscarEmails(a, emails);
                    break;
                    
                case 5: 
                    System.out.println(tam);
                    break;
                case 6:
                System.out.println(" Qual a posição que você deseja procurar ") ;
                p=s.nextInt() ;
                s.nextLine();
                buscarPos(p, pos);
                    break;
                    
                case 7:
                 System.out.println("Qual palavra procurar?");
                    a=s.nextLine();
                    buscarGeral(a,pc);
                    break;   
                    
                default:
                System.out.println("Encerrando o programa");
                    break;
            }
        }
    }
}
