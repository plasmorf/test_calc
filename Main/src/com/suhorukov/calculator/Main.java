package com.suhorukov.calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Администратор on 19.09.2015.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        if (args[0].indexOf("-f") > 0 && args[1].length() > 0)
        {
            Calculator calc = new Calculator(new Scanner(new File(args[1])));
        }
        else{
            Calculator calc = new Calculator(new Scanner(new File(args[1])));
        }

    }

    public static int maxInt(int x, int y){return x>y?x:y;};
    public static double avg(int x, int y){return (Double.valueOf(x)+y)/2;}
}
