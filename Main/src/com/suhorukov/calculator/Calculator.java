package com.suhorukov.calculator;


import java.util.*;

/**
 * Created by Администратор on 19.09.2015.
 */
public class Calculator {
    Map<String, Command> commandList;
    Map<String, Double> cmds;
    Scanner scanner;
    Command cmd;

    public void exec (){
        String []str;

        do {
            str = scanner.next().split(" ");
            if (str.length > 0 ) {
                Stack<Double> vstack = null;
                Command c = commandList.get(str[0]);
                c.execute(vstack, cmds, str);
            };

        }while (str[0].equals("exit") || scanner.hasNext());
    }    
    
    Calculator(Scanner pscanner){
        scanner = pscanner; 
        commandList.put("add", new Add());
        commandList.put("sub", new Sub());
        commandList.put("div", new Div());
        commandList.put("mult", new Mult());
        commandList.put("push", new Push());
        commandList.put("pop", new Pop());
        commandList.put("define", new Define());

    };
    
    
}
