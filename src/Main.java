import ArrayProblems.ArrayaproblemList;
import DigitProblems.DigitproblemList;
import NumbersProblems.NumbersproblemList;
import PatternProblems.PatternproblemList;
import PrimeProblems.PrimeproblemList;
import StringProblems.StringproblemList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        while (true){
            System.out.println("=============================");
            System.out.println("WELCOME TO JAVA PROBLEMS GAME");
            System.out.println("=============================");
            System.out.println("1.NUMBERS-PROBLEM-GAME");
            System.out.println("2.DIGITS-PROBLEM-GAME");
            System.out.println("3.PRIME-PROBLEM-GAME");
            System.out.println("4.ARRAY-PROBLEM-GAME");
            System.out.println("5.STRING-PROBLEM-GAME");
            System.out.println("6.PATTERN-PROBLEM-GAME");
            System.out.println("7.EXIT");
            System.out.println("=============================");
            System.out.println("");
            System.out.print("ENTER YOUR CHOICE :");
            int choice = get.nextInt();

            switch (choice){
                case 1:
                    NumbersproblemList number = new NumbersproblemList(get);
           number.problemlist();
           break;
                case 2:
                    DigitproblemList digit = new DigitproblemList(get);
                    digit.problemlist();
                    break;
                case 3:
                    PrimeproblemList prime = new PrimeproblemList(get);
                    prime.problemlist();
                    break;
                case 4:
                    ArrayaproblemList array = new ArrayaproblemList(get);
                    array.problemlist();
                    break;
                case 5:
                    StringproblemList string = new StringproblemList(get);
                    string.problemlist();
                    break;
                case 6:
                    PatternproblemList pattern = new PatternproblemList(get);
                    pattern.problemlist();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("INVALIDE GAME CHOICE - BATTER LUCK NEXTTIME");
            }
        }
    }
}
