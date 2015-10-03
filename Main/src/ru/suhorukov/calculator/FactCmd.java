package ru.suhorukov.calculator;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by Администратор on 01.10.2015.
 */
public class FactCmd implements Factory {
    private Map<String, Command> commandList = null;

    FactCmd (){
        Properties prop = new Properties();
        commandList = new HashMap<>();

        for(Iterator<Command> it = ServiceLoader.load(Command.class).iterator(); it.hasNext();){

        }
/*
        try (InputStream resourceAsStream = Calculator.class.getResourceAsStream("CmdList.properties")){
            prop.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        prop.entrySet().forEach(a -> {
            Class cls = null;
            try {
                cls = Class.forName((String)a.getValue());
                commandList.put((String)a.getKey(), (Command)cls.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
*/

    }

    @Override
    public Command getCmdByName(String cmdName) {
        return commandList.get(cmdName);
    }
}
