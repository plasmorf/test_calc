package ru.suhorukov.calculator;

import java.util.Map;

/**
 * Created by Администратор on 01.10.2015.
 */
interface Factory {

    Command getCmdByName(String cmdName);
}
