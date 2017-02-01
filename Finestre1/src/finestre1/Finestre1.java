package finestre1;

import java.util.Scanner;

public class Finestre1 {

    public static void main(String[] args) {
        int n; //Numero di finestre da aprire
        int i=0;
        Finestra f;
        
        Scanner input = new Scanner(System.in);

        //Input del numero di finestre
        do{
            System.out.println("Quante finestre vuoi aprire?");
            n = input.nextInt();
        }while(n<1 || n>4);
        
        
        do{
            f = new Finestra();
            f.setVisible(true);
            f.testo.setText("Sono la finestra "+(i+1));
            f.setLocation(n*10+100, n*10);
            n--;
            i++;
        }while(n>0);
    }

}
