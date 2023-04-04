package ATV1;
import java.util.Scanner;
public class Ativ1 {

    public static double calculaDelta(double a,double b,double c){
        double delta;
        delta=Math.pow(b,2)-4*a*c;
        if(delta<0){
            return -1;
        } 
        delta= Math.sqrt(delta);
        return delta;
    }
    public static double resultOne(double a,double b,double c,double delta){
        double resultOne;
        resultOne=((-b)+ delta)/2*a;
        return resultOne;
        
    }
    public static double resultTwo (double a,double b,double c,double delta){
        double resultTwo;
        resultTwo=((-b)+ delta)/2*a;
        return resultTwo;
    }
    public static void main(String[] args) {
        double a,b,c,resultOne, resultTwo, delta;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o a da sua equacao: ");
        a=s.nextDouble();
        System.out.println("Digite o b da sua equacao: ");
        b=s.nextDouble();
        System.out.println("Digite o c da sua equacao: ");
        c=s.nextDouble();
        delta=calculaDelta(a, b, c);
        if(delta==-1){
            System.out.println("Nã há raízes para essa equação");
        } else {
            resultOne=resultOne(a,b,c,delta);
            resultTwo=resultTwo(a,b,c,delta);
            
            System.out.printf("As raizes da sua equação: %f e %f ", resultOne, resultTwo);
        }
    }
}