package com.lab9;
public class JunitTesting
{
    public static void main(String[] args) {
        int num1 = 5, num2 = 15;
        String s1 = "Aman", s2 = "Singh";
        Sum(num1, num2);
        Concat(s1, s2);
    }

    //add 2 numbers
    public static void Sum(int x, int y)
    {
        int s;
        s=x+y;
        System.out.println(s);
    }

    //concat 2 strings
    public static void Concat(String x, String y)
    {
        String s;
        s = x+y;
        System.out.println(s);
    }
}
