package ru.suhorukov.calculator;

import java.util.Map;
import java.util.Stack;

/**
 * Created by Администратор on 19.09.2015.
 */
@CmdName("add")
public class Add implements Command {
    @In(type = ArgType.STACK)
    private Stack<Double> stack;

    @Override
    public void execute(Stack<Double> stack, Map<String, Double> vars, String[] args) {

    };

    @PreCondition(minArgSize = 2)
    public void exec(String[] args) {

    }
}
