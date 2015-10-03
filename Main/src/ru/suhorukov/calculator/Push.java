package ru.suhorukov.calculator;

import java.util.*;
/**
 * Created by Администратор on 19.09.2015.
 */
@CmdName("push")
public class Push implements Command {
    @In(type = ArgType.STACK)
    private Stack<Double> stack;

    @In(type = ArgType.CONTEXT)
    private String[] args;

    @Override
    public void execute(Stack<Double> stack, Map<String, Double> vars, String[] args) {
            stack.push(Double.parseDouble(args[1]));
    }

    @Override
    public void exec(String[] args) {

    }
}
