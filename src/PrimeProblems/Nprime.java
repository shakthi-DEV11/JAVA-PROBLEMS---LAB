package PrimeProblems;

import java.util.Scanner;

public class Nprime {
    Scanner get;
    public Nprime(Scanner get){
        this.get = get;
    }
    public void start (){
        System.out.print("how maney time you paly checking game :");
        int count = get.nextInt();
        if (count==0){
            try {
                throw new Exception("ATLEAST YOU'R PLAYING TIME[1] TO MOVE ON A GAME ELSE (EXIT)  ");
            } catch (Exception e){
                System.out.println("PROBLEM :"+ e.getMessage());
            } finally {
                System.out.println("MASSAGE RECIVED SUCESSFULLY");
            }
        }
        for (int i = 0; i <count ; i++) {
            System.out.print("ENTER A RANGE OF PRIME NUMBERS :");
            int num = get.nextInt();
           printprime (num);

        }
    }
    public static boolean isprime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i*i <=num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
public static void printprime(int num){
    for (int i = 2; i <=num ; i++) {
        if (isprime(i)){
            System.out.println(i);
        }
    }
}
    }

