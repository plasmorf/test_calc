package ru.suhorukov.calculator;

import java.util.Map;

/**
 * Created by ������������� on 01.10.2015.
 */
interface Factory {

    Command getCmdByName(String cmdName);
}
