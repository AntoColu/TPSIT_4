package rettangolooop;

import java.util.Scanner;

public class RettangoloOOP {

    public static void main(String[] args) {
        double L1;
        double L2;
        
        Scanner input = new Scanner(System.in);

        //Input della base
        System.out.println("Quanto vale la base?");
        L1 = input.nextDouble();
        
        //Input dell'altezza
        System.out.println("Quanto vale l'altezza?");
        L2 = input.nextDouble();
        
        
        //Creazione dell'oggetto r di Rettangolo
        Rettangolo r;
        r = new Rettangolo(L1, L2);

        
        //Creazione dell'oggetto f di Finestra
        Finestra f;
        f= new Finestra();
        
        f.setVisible(true);
        f.area.setText("Area= "+r.calcolaArea()); //Calcolo e stampa dell'area
        f.perim.setText("Perimetro= "+r.calcolaPeri()); //Calcolo e stampa del perimetro
    }

}
