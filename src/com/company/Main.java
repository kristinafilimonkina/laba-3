package com.company;

public class Main
{

    public static void main(String[] args)
    {

        for (int i = 1; i < 11; i++)
        {
            System.out.println("Умножение на:" + i++);

            for (int f = 1; f < 11; ++f)
            {
                System.out.println(f + "*" + i + "=" + f * i);
            }
        }
    }
}