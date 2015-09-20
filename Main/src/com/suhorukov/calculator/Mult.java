package com.suhorukov.calculator;


import java.util.*;

/**
 * Created by Администратор on 19.09.2015.
 */
public class Mult implements Command {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> vars, String[] args) {
        stack.push(stack.pop() * stack.pop());
    }
}
