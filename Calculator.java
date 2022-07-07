package SmallProject.com.calculator;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Choose Your Operator : ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter Your First Number :");
                int num1 = sc.nextInt();
                System.out.print("Enter Your Second Number :");
                int num2 = sc.nextInt();
                
                if(op == '+'){
                    ans  = num1 + num2;
                }
                else if(op == '-'){
                    ans = num1 - num2;
                }
                else if(op == '*'){
                    ans = num1 * num2;
                }
                else if(op == '/'){
                    if(num1 !=0 || num2 !=0){
                        ans = num1 / num2;
                    }
                }
                else if(op == '%'){
                    ans = num1 % num2;
                }
            }
            else if(op=='x' || op=='X'){
                System.out.println("Thanks for Using our CalC");
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
            System.out.println( "Your Ans is : "+ans);

        }

        sc.close();

    }
}
