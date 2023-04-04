package uber;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("O que você deseja fazer?");
        System.out.println("1- cadastrar passageiro");
        System.out.println("2- Cadastrar motorista");
        System.out.println("3-solicitar corrida");
        System.out.println("4-aceitar corrida");
        System.out.println("Outro- fecar programa");
    }

    public static void Main(String[] args) {
        char z;
        Scanner s = new Scanner(System.in);
        String nome, nota, telefone;
        double saldo, a, b, c, corrida=0;
        int op;
        passageiro passageiro=new passageiro(null, null, null);
        motorista motorista = new motorista(null, null, 0);
        boolean cont = true;
        while (cont == true) {
            menu();
            op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Cadastro passageiro:");
                    System.out.println("Nome :");
                    nome = s.nextLine();
                    passageiro.setNome(nome);
                    System.out.println("Nota :");
                    nota = s.nextLine();
                    passageiro.setNota(nota);
                    System.out.println("Telefone: ");
                    telefone = s.nextLine();
                    passageiro.setTelefone(telefone);
                    break;
                case 2:
                    System.out.println("Cadastro motorista:");
                    System.out.println("Nome :");
                    nome = s.nextLine();
                    motorista.setNome(nome);
                    System.out.println("Nota :");
                    nota = s.nextLine();
                    motorista.setNota(nota);
                    System.out.println("Saldo: ");
                    saldo = s.nextDouble();
                    motorista.setSaldo(saldo);
                    s.nextLine();
                    break;
                case 3:
                    System.out.println(" Passageiro, digite suas coordenadas. Inicie com o a: ");
                    a = s.nextDouble();
                    System.out.println("b");
                    b = s.nextDouble();
                    System.out.println("c");
                    c = s.nextDouble();
                    System.out.println("Corrida solicitada");
                    corrida=passageiro.solicitarCorrida(a, b, c);
                    if(corrida<0){
                        System.out.println("Corrida inválida.");
                        corrida=0;
                    }
                    break;
                case 4:
                    System.out.println("O percurso da corrida é :"+ corrida);
                    System.out.println("Você deseja realizar a corrida? s- sim n-não");
                    z=s.nextLine().charAt(0);
                    while(z!='s'&& z!='n'){
                        System.out.println("Digite novamente");
                        z=s.nextLine().charAt(0);
                    }
                    motorista.aceitarCorrida(z, corrida);
                    break;
                default:
                    System.out.println("Encerrando programa");
                    s.close();
                    cont=false;
                    break;
            }

        }

    }
}
