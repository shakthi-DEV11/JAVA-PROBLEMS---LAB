package PrimeProblems;

import java.util.Scanner;

public class Checkprime {
    Scanner get;
    public Checkprime(Scanner get){
        this.get = get;
    }
    public void start(){
        System.out.print("how maney time you paly checking game :");
        int count = get.nextInt();
        for (int i = 0; i <count ; i++) {
            System.out.print("enter a check number:");
            int num = get.nextInt();
            prime(num);
        }
    }
    public void prime(int num){
        boolean isprime = true;
        try {
            if (num < 2) {
                isprime = false;
                throw new RuntimeException("your try to checking not prime number please enter grater then 2.");
            } else {

            }
        } catch (Exception e){
            System.out.println("problem :" + e.getMessage());
        } finally {
            System.out.println("RESTART COME BACK YOUR GAME NOW👌 ");
        }
        for (int i = 2; i *i<num ; i++) {
            isprime = false;
        }
        if (isprime){
            System.out.println(num+" "+"is a prime number");
        } else {
            System.out.println(num+" "+"is not a prime number");
        }
    }

}


