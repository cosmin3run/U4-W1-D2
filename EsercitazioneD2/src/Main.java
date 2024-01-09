import it.epicode.be.automobile.Automobile;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automobile auto = new Automobile( 1100,"XY5670", false );

        System.out.printf("Esercizio D2");
        //chiedere all'utente di caricare la batteria
        System.out.println("La batteria è carica? (true/false) ");
        boolean statoBatteria = scanner.nextBoolean();
        auto.setBatteriaCarica(statoBatteria);
        auto.avviaMotore();

        if(auto.isBatteriaCarica()){
            System.out.println("il motore è avviato");
        } else {
            System.out.println("Il motore non è avviato");
        }
        scanner.close();
    }
}