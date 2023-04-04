package ATV6;

import java.util.Scanner;

public class MainCircuferencias {
    public static void main(String[] args) {
        Circuferencias c;
        Scanner s = new Scanner (System.in);
        int dcp, raio,cont=0;
        while(cont<5){
            System.out.println("Digite a distancia: ");
            dcp=s.nextInt();
            System.out.println("digite o raio");
            raio=s.nextInt();
            c=new Circuferencias(dcp, raio);
            if(c.IsInside(dcp, raio)){
                System.out.println("Está dentro");
            } else{
                System.out.println("Está fora");
            }
            

            cont++;
        }
        s.close();
    }
}
