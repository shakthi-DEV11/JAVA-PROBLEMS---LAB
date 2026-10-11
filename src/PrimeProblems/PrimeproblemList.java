package PrimeProblems;

import java.util.Scanner;

public class PrimeproblemList {
    Scanner get;

    public PrimeproblemList(Scanner get) {
        this.get = get;
    }

    public void problemlist() {
        while (true) {
            System.out.println("1.CHECK A PRIME NUMBER");
            System.out.println("2.PRINT 1 TO N  PRIME NUMBER");
            System.out.println("2.PRINT  N-TH  PRIME NUMBER");
            System.out.print("ENTER YOUR CHOICE :");
            int choice = get.nextInt();
            switch (choice){
                case 1:
                    Checkprime game = new Checkprime(get);
                           game.start();
                           break;
                case 2:
                    Nprime lestgo = new Nprime(get);
                    lestgo.start();
                    break;
                case 3:
                    NthPrime leststart = new NthPrime(get);
                    leststart.start();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("INVALUDE CHOICE");
            }
        }

    }
}
