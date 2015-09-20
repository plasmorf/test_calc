package com.suhorukov.calculator;



import java.util.*;

/**
 * Created by Администратор on 19.09.2015.
 */
public class Print implements Command {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> vars, String[] args) {

        System.out.println(stack.get(0));
    }
}
