package javabasic;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1,num2;
        System.out.print("Enter an operator : ");
        char operator = input.next().charAt(0);
        System.out.println("Enter num 1 :");
        num1= input.nextDouble();
        System.out.println("Enter num 2 :");
        num2= input.nextDouble();

        switch(operator){
            case '+':
                System.out.println("result = "+ (num1+num2));
                break;
            case '*':
                System.out.println("result = "+(num1*num2));
                break;
            case '/':
                System.out.println("result = "+(num1/num2));
                break;
            case '-':
                System.out.println("result = "+(num1-num2));
            case '%':
                System.out.println("result = "+(num1%num2));
            default:
                System.out.println("Enter valid operation");
        }
    }
}
