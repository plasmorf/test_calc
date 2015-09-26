package ru.suhorukov.calculator;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
/**
 * Created by Администратор on 19.09.2015.
 */
public class Calculator {
    private Map<String, Command> commandList;
    private Map<String, Double> cmds;
    private Scanner scanner;
    private Command cmd;

    public void exec (){
        String []str;

        do {
            str = scanner.next().split(" ");
            if (str.length > 0 ) {
                Stack<Double> vstack = new Stack<>();
                Command c = commandList.get(str[0]);
                c.execute(vstack, cmds, str);
            };

        }while (str[0].equals("exit") || scanner.hasNext());
    }    
    
    Calculator(Scanner pscanner){
        Properties prop = new Properties();
        Map<String, Command> commandList = new HashMap<>();

        try (InputStream resourceAsStream = Calculator.class.getResourceAsStream("CmdList.properties")){
            prop.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner = pscanner;

        prop.entrySet().forEach(a -> {
            Class cls = null;
            try {
                cls = Class.forName((String)a.getValue());
                commandList.put((String)a.getKey(), (Command)cls.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        /*
        commandList.put("add", new Add());
        commandList.put("sub", new Sub());
        commandList.put("div", new Div());
        commandList.put("mult", new Mult());
        commandList.put("push", new Push());
        commandList.put("pop", new Pop());
        commandList.put("define", new Define());
*/
    };
    
    
}
