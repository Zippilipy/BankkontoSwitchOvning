/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankkontoswitch;

import java.util.Scanner;

/**
 *
 * @author 46708
 */
public class Bankkontoswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        double belopp = 1000;
        do {
            if (Double.isInfinite(belopp)) {
                System.out.println("Belopp överskredde max gräns, avslutar.");
                System.exit(0);
            }
            System.out.println("Välkommen till min bank!");
            System.out.println("1. Insättning");
            System.out.println("2. Uttag");
            System.out.println("3. Belopp");
            System.out.println("4. Avsluta programmet");

            int val = scan.nextInt();

            switch (val) {
                case 1 -> {
                    System.out.println("Hur mycket vill du lägga in? Du har " + belopp + " kr i kontot");
                    double inlägg = scan.nextDouble();
                    if (inlägg > 0) {
                        System.out.println("Du lade in " + inlägg + " kr, du har " + (belopp + inlägg) + " kr i kontot");
                        belopp += inlägg;
                    } else {
                        System.out.println((char) 27 + "[31m" + "Felinmatning");
                    }
                }
                case 2 -> {
                    System.out.println("Hur mycket vill du ta ut? Du har " + belopp + " kr i kontot");
                    double utdrag = scan.nextDouble();
                    if (utdrag <= belopp && utdrag > 0) {
                        System.out.println("Du gjorde ett utdrag på " + utdrag + " kr, du har " + (belopp - utdrag) + " kr i kontot");
                        belopp -= utdrag;
                    } else {
                        System.out.println((char) 27 + "[31m" + "Felinmatning");
                    }
                }
                case 3 -> {
                    System.out.println("Du har " + belopp + " kr i kontot");
                }
                case 4 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println((char) 27 + "[31m" + "Felinmatning");
                }
            }

        } while (true);
    }

}
