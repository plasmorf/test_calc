package ru.suhorukov.calculator;

import java.util.*;

/**
 * Created by ������������� on 19.09.2015.
 */
public class Div implements Command {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> vars, String[] args) {
        stack.push(stack.pop() / stack.pop());

    }
}
