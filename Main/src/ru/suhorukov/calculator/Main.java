package ru.suhorukov.calculator;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Администратор on 19.09.2015.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Calculator calc;


        if (args.length > 1)
        {
            calc = new Calculator(new Scanner(new File(args[1])));
        }
        else{
            calc = new Calculator(new Scanner(System.in));
        }

        calc.exec();

    }

    public static int maxInt(int x, int y){return x>y?x:y;};
    public static double avg(double x, double y){return (x+y)/2;}
}
