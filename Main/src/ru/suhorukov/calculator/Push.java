package ru.suhorukov.calculator;

import java.util.*;
/**
 * Created by Администратор on 19.09.2015.
 */
public class Push implements Command {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> vars, String[] args) {
        stack.push(Double.parseDouble(args[0]));
    }
}
