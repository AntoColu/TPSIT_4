package areaperimetrorettangolo;

import java.util.Scanner;

public class AreaPerimetroRettangolo {
    
    public static void main(String[] args) {
        int b;      //Base
        int h;      //Altezza
        int perim;  //Perimetro
        int area;   //Area
        
        Scanner input = new Scanner(System.in);
        
        //Input della base (solo valori positivi)
        do{
            System.out.print("Inserisci la base ");
            b = input.nextInt();
        }while(b<=0);
        
        //Input dell' altezza (solo valori positivi)
        do{
            System.out.print("Inserisci l'altezza ");
            h = input.nextInt();
        }while(h<=0);
        
        perim = (b+h)*2; //Calcolo perimetro
        
        area = b*h; //Calcolo area
        
        System.out.println("Il perimetro è = " +perim);    //Output perimetro
        System.out.println("L'area è = " +area);   //Output area
        
    }
    
}
