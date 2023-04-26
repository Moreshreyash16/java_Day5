package Bridgelabz.Day5;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int sum=0;
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1) {
            System.out.println(1);
        }
        else {
            for (int i = 1; i < n; i++) {
                sum=first+second;
                first=second;
                second=sum;
            }
        }
        System.out.println(sum);
    }
}
