package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        System.out.println("(Recursive) The Common Divisor of " + x + " and " + y + " is: "+gcdr(x, y));
        System.out.println("(Iterative) The Common Divisor of " + x + " and " + y + " is: "+gcdi(x, y));
    }
    //Recursive Method

    public static int gcdr(int x, int y)
    {
        if (y == 0)
        {
            return x;
        }
        if (x < 0)
        {
            return gcdr(x * -1, y);
        }
        if(y < 0)
        {
            return gcdr(x, y * -1);
        }
        if(y <= x && x % y == 0)
        {
            return y;
        }
        return gcdr(y, x%y);
    }
    //Iterative Method
    public static int gcdi(int x, int y)
    {
        if (x == 0)
        {
            return y;
        }
        while(y != 0)
        {
            if(x > y)
            {
                x = x - y;
            }else{
                y = y - x;
            }
        }
        return x;
    }
}
