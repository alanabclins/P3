import java.util.Scanner;

public class MainAgenda {
    public static  void menuAgenda(){
        System.out.println("*MENU AGENDA*");
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
    public static void menuUm() {
        System.out.println("1- Agenda");
        System.out.println("2- Contato");
        System.out.println("3- Contato Basico");
        System.out.println("4- Contato Comercial");
        System.out.println("5- eContato");
        System.out.println("6- Telefone");
        System.out.println("Outro- Encerrar");
        System.out.println("Digite sua opção:");
    }

    public static void main(String[] args) {
        int tam, op,op2;
        Scanner s = new Scanner(System.in);
        boolean cont = true;
        System.out.println("Quantas pessoas você deseja salvar?");
        tam = s.nextInt();
        Agenda[] a = new Agenda[tam];
        contato[] c = new contato[tam];
        contatoBasico[] cb = new contatoBasico[tam];
        contatoComercial[] cc = new contatoComercial[tam];
        eContato[] ec = new eContato[tam];
        telefone[] tel = new telefone[tam];
        String nomes,pc, email,st,numero,tipo,datansc,atividade,funcionario,homepage,hp;
        int idade,pos,aux;

        while (cont == true) {
            menuUm();
            op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
            
                menuAgenda();
                op2=s.nextInt();
                s.nextLine();
                switch (op2) {
                    case 1:
                    for (int i = 0; i <= tam-1; i++) {
                        pos=i;
                        System.out.println("Insira o nome");
                        nomes=s.nextLine();
                        System.out.println("Insira o email");
                        email=s.nextLine();
                        System.out.println("Insira a palavra chave ") ;
                        pc = s.nextLine() ;
                        a [i]= new Agenda(nomes, email, pc,pos);
                      
                      }
                       break;
                    case 2:
                    for (int i = 0; i <=tam-1; i++) {
                        a[i].toString();
                    }
                    break;
                    case 3:
                    System.out.println("Qual nome você deseja buscar?");
                    st=s.nextLine();
                    Agenda.buscarNome(st,a);
                    break;
                    case 4:
                    System.out.println("Qual email você deseja buscar?");
                    st=s.nextLine();
                    Agenda.buscarEmails(st, a);
                    break;
                    case 5:
                    System.out.println(tam);
                    break;
                    case 6:
                    System.out.println("Qual posição você deseja encontrar?");
                    aux=s.nextInt();
                    Agenda.buscarPos(aux, a);
                    break;
                    case 7:
                    System.out.println("Qual palavra-chave você deseja buscar?");
                    st=s.nextLine();
                    Agenda.buscarGeral(st, a);
                    default:
                        break;
                }
                    break;
                case 2:
                int j=0;
                System.out.println("Inserindo contato");
                while(j<tam){
                        pos=j;
                        System.out.println("Insira o nome");
                        nomes=s.nextLine();
                        System.out.println("Insira o numero");
                        numero=s.nextLine();
                        System.out.println("Insira tipo") ;
                        tipo = s.nextLine();
                        System.out.println("Insira a data de nascimento ") ;
                        datansc = s.nextLine() ;
                        System.out.println("Insira a idade ") ;
                        idade= s.nextInt() ;
                        c [j]= new contato(numero,tipo, nomes, datansc,idade);
                        s.nextLine();
                        j++;
                }
                System.out.println("Dados");
                for (int i = 0; i < tam; i++) {
                    c[i].getDados();
                }
                System.out.println("Idades");
                for (int i = 0; i < tam; i++) {
                    c[i].getIdade();
                }
                    break;

                case 3:
                System.out.println("Inserindo contato basico");
                for (int i = 0; i < tam; i++) {
                    System.out.println("Insira o nome");
                    nomes=s.nextLine();
                    System.out.println("Insira o numero");
                    numero=s.nextLine();
                    System.out.println("Insira tipo") ;
                    tipo = s.nextLine();
                    cb[i]= new contatoBasico(numero, tipo, nomes);
                }
                System.out.println("Get nome:");
                for (int i = 0; i < tel.length; i++) {
                    cb[i].getNome();
                }
                System.out.println("Get Dados:");
                for (int i = 0; i < tel.length; i++) {
                    cb[i].getDados();
                }
                System.out.println("Deseja realizar o set?\n 1-sim 2-nao");
                int set=s.nextInt();
                if(set==1){
                    System.out.println("1- Teelefone 2-Nome");
                    set=s.nextInt();
                    if (set==1){
                        System.out.println("Indice de mudanca");
                        set=s.nextInt();
                        s.nextLine();
                        System.out.println("Mudanca");
                        st=s.nextLine();
                        cb[set].setNome(st);
                    } else {
                        System.out.println("Indice de mudanca");
                        set=s.nextInt();
                        s.nextLine();
                        System.out.println("Mudanca");
                        st=s.nextLine();
                        cb[set].setNumero(st);
                    }
                }
                    break;
                case 4:
                System.out.println("Inserindo contato comercial");
                for (int i = 0; i < tam; i++) {
                    System.out.println("Insira o nome");
                    nomes=s.nextLine();
                    System.out.println("Insira o numero");
                    numero=s.nextLine();
                    System.out.println("Insira tipo") ;
                    tipo = s.nextLine();
                    System.out.println("Insira a atividade");
                    atividade=s.nextLine();
                    System.out.println("Insira o funcionario") ;
                    funcionario = s.nextLine();
                    cc[i]= new contatoComercial(numero, tipo, nomes,atividade,funcionario);
                }
                System.out.println("Get Dados:");
                for (int i = 0; i < tel.length; i++) {
                    cc[i].getDados();
                }

                    break;
                case 5:
                    System.out.println("Inserindo o eContato");
                    for (int i = 0; i < tam; i++) {
                        System.out.println("Insira o nome");
                        nomes=s.nextLine();
                        System.out.println("Insira o numero");
                        numero=s.nextLine();
                        System.out.println("Insira tipo") ;
                        tipo = s.nextLine();
                        System.out.println("Insira a data de nascimento ") ;
                        datansc = s.nextLine() ;
                        System.out.println("Insira a idade ") ;
                        idade= s.nextInt() ;
                        s.nextLine(); 
                        System.out.println("Insirao email");
                        email=s.nextLine();
                        System.out.println("Insira homepage") ;
                        homepage = s.nextLine();
                        System.out.println("Insira hp") ;
                        hp = s.nextLine() ;

                        ec [i]= new eContato(numero,tipo, nomes, datansc,idade,email,homepage,hp);
                        s.nextLine();
                    }

                    System.out.println("Get dados");
                    for (int i = 0; i < tel.length; i++) {
                        ec[i].getDados();
                    }
                    System.out.println("Get emails");
                    for (int i = 0; i < tel.length; i++) {
                        ec[i].getEmail();
                    }

                    System.out.println("Get homepage");
                    for (int i = 0; i < tel.length; i++) {
                        ec[i].getHomepage();
                    }
                    break;
                case 6:
                for (int i = 0; i < tel.length; i++) {
                    System.out.println("Insira o numero");
                        numero=s.nextLine();
                        System.out.println("Insira tipo") ;
                        tipo = s.nextLine();
                        tel [i]=new telefone(numero, tipo);
                        
                }
                System.out.println("Telefone:");
                for (int i = 0; i < tel.length; i++) {
                    tel[i].getTelefone();
                }

                    break;

                default:
                    System.out.println("Encerrado");
                    s.close();
                    cont = false;
                    break;
            }
        }

    }
}
