package ru.suhorukov.calculator;

import java.util.*;

/**
 * Created by Администратор on 19.09.2015.
 */
public interface Command {
    void execute(Stack<Double> stack, Map<String, Double> vars, String []args);
    void exec(String[] args);
}
