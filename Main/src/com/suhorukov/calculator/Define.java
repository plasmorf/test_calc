package com.suhorukov.calculator;


import java.util.*;

/**
 * Created by ������������� on 19.09.2015.
 */
public class Define implements  Command {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> vars, String[] args) {
         vars.put(args[0], Double.parseDouble(args[1]));
    }
}
