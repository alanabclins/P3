
import java.util.Scanner;

public class Contas {
    public static void contas() {
        System.out.println("1- Poupança");
        System.out.println("2- Corrente");
    }

    public static void menu() {
        System.out.println("1- Criar conta");
        System.out.println("2-Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- Consultar saldo");
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double aux;
        int tipo;
        int op = 0, cont = 1,diarend=0;
        int ag = 0, num = 0, cpf = 0;
        String nome = null, end = null;
        double saldo = 0, value;
        ContaEspecial conta = new ContaEspecial(0, 0, null, 0, null, 0);
        ContaEspecial[] contas = new ContaEspecial [10];
        poupanca poupancas [] = new poupanca [10];
        poupancas[0]= new poupanca(0, 0, null, 0, null, 0, 0);
        int iCE =0, iP=0;    
        while (cont > 0) {
            System.out.println("Qual conta você deseja realizar operações? ");
            contas();
            tipo = s.nextInt();
            // Poupança
            if (tipo == 1) {
                System.out.println("Qual sua opção");
                menu();
                System.out.println("5- Atualizar valor");
                op = s.nextInt();
                s.nextLine();
                switch (op) {
                    case 1:
                    if(iP<10){
                        System.out.println("Digite o número da sua agência:");
                        ag = s.nextInt();
                        num = (int) Math.random();
                        System.out.println("Digite seu cpf:");
                        cpf = s.nextInt();
                        System.out.println("Digite o saldo da sua conta:");
                        saldo = s.nextDouble();
                        s.nextLine();
                        System.out.println("Digite seu nome:");
                        nome = s.nextLine();
                        System.out.println("Digite seu endereço:");
                        end = s.nextLine();
                        iP++;
                        poupancas[iP]= new poupanca(ag, cont, nome, cpf, end, saldo, diarend);
                        System.out.println("Conta número " + poupancas[iP].getNumDaConta()+ " criada!");
                    } else {
                        System.out.println("Limite de contas atingido");
                    }
                        break;
                    case 2:
                        System.out.println("Digite o valor que vocé deseja depositar: ");
                        value = s.nextDouble();
                        poupancas[iP].depositar(value);
                        System.out.println("Saldo=" + poupancas[iP].getSaldo());
                        break;
                    case 3:
                        System.out.println("Qual valor você deseja retirar?");
                        value = s.nextDouble();
                        aux = poupancas[iP].sacar(value);
                        if (aux < 0) {
                            System.out.println(
                                    "Com seu saldo atual de " + conta.getSaldo() + "não foi possível realizar o saque");
                        } else {
                            System.out.println("Saque efetuado. Novo saldo= " + conta.getSaldo());
                        }
                        break;
                    case 4:
                        System.out.println("Saldo =" + poupancas[iP].getSaldo());
                        break;
                    case 5:
                        System.out.println("Qual seu rendimento?");
                        double rendimento= s.nextDouble();
                        poupancas[iP].atualiza(rendimento);
                        System.out.println("Rendimento atualizado " + poupancas[iP].getSaldo());
                    break;
                    default:
                        if (op < 0) {
                            System.out.println("Encerrado programa.");
                            cont = -1;
                        } else {
                            System.out.println("Número inválido.");
                        }
                        break;
                }
            } else if (tipo==2) {
                System.out.println("Qual sua opção");
                menu();
                op = s.nextInt();
                s.nextLine();
                switch (op) {
                    case 1:
                    if(iCE<10){
                        System.out.println("Digite o número da sua agência:");
                        ag = s.nextInt();
                        num = (int) Math.random();
                        System.out.println("Digite seu cpf:");
                        cpf = s.nextInt();
                        System.out.println("Digite o saldo da sua conta:");
                        saldo = s.nextDouble();
                        s.nextLine();
                        System.out.println("Digite seu nome:");
                        nome = s.nextLine();
                        System.out.println("Digite seu endereço:");
                        end = s.nextLine();
                        iCE++;
                        contas[iCE]= new ContaEspecial(ag, cont, nome, cpf, end, saldo);
                        System.out.println("Conta número " + contas[iCE].getNumDaConta()+ " criada!");
                    }  else {
                        System.out.println("Número de contas atingido");
                    }
                        break;
                    case 2:
                        System.out.println("Digite o valor que vocé deseja depositar: ");
                        value = s.nextDouble();
                        poupancas[iP].depositar(value);
                        System.out.println("Saldo=" + contas[iCE].getSaldo());
                        break;
                    case 3:
                        System.out.println("Qual valor você deseja retirar?");
                        value = s.nextDouble();
                        aux = contas[iCE].saqueEspecial(value);
                        if (aux < 0) {
                            System.out.println(
                                    "Com seu saldo atual de " + conta.getSaldo() + "não foi possível realizar o saque");
                        } else {
                            System.out.println("Saque efetuado. Novo saldo= " + conta.getSaldo());
                        }
                        break;
                    case 4:
                        System.out.println("Saldo =" + contas[iCE].getSaldo());
                        break;
                    default:
                        if (op < 0) {
                            System.out.println("Encerrado programa.");
                            cont = -1;
                        } else {
                            System.out.println("Número inválido.");
                        }
                        break;
                }
            } else {
                System.out.println("Tipo errado.");
            }

        }

    }

}