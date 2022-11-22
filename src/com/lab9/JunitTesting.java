package com.lab9;
public class JunitTesting
{
    public static void main(String[] args) {
        int num1 = 5, num2 = 15;
        String s1 = "Aman", s2 = "Singh";
        System.out.println(Sum(num1, num2));
        System.out.println(Concat(s1, s2));
    }

    //add 2 numbers
    public static int Sum(int x, int y)
    {
        int s;
        s=x+y;
        return(s);
    }

    //concat 2 strings
    public static String Concat(String x, String y)
    {
        String s;
        s = x+y;
        return(s);
    }
}
