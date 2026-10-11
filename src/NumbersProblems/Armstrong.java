package NumbersProblems;

import java.util.Scanner;

public class Armstrong {
    Scanner get;
    public  Armstrong(Scanner get){
        this.get = get;
    }
    public void start() {
        System.out.print("how maney time you paly checking game :");
        int count = get.nextInt();
        for (int i = 0; i <count ; i++) {
            System.out.print("enter a check number:");
            int num = get.nextInt();
            sumarmstromg(num);
        }
    }
    public void sumarmstromg(int num){

    }
}
