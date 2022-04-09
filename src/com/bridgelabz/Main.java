package com.bridgelabz;import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double result,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        n=sc.nextInt();
        if(n==0) {
            System.out.println(" value of N :  " + n);
            System.out.println(" It should be greater than 0");
        }
        else{
           // System.out.println("");
            for(int i = 1;i<=n;i++)
            {
                result=(float)(1/i);
                System.out.println("1/"+i+" : "+result);
            }
        }

    }
}
