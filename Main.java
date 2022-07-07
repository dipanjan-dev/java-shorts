package com.dsSheet;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter The Number : ");
        int i = input.nextInt();
        int user_rem = input.nextInt();
        int count= 0;
        while(i>0){
            int rem = i%10;
            if(rem == user_rem){
                count++;
            }
            i = i/10;
        }
        System.out.println(count);

        input.close();
    }
}