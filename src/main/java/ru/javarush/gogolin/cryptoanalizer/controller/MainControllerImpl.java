package ru.javarush.gogolin.cryptoanalizer.controller;

import ru.javarush.gogolin.cryptoanalizer.action.Action;
import ru.javarush.gogolin.cryptoanalizer.action.Decoder;
import ru.javarush.gogolin.cryptoanalizer.action.Encoder;
import ru.javarush.gogolin.cryptoanalizer.entity.Result;
import ru.javarush.gogolin.cryptoanalizer.exceptions.ArgumentsListException;

public class MainControllerImpl implements MainController{
    public MainControllerImpl(){
    }
    public Result doAction(String actionName, String[] args){
        if(args.length < 3){
            throw new ArgumentsListException("Ошибка. Задано мало аргументов.");
        }else if(args.length > 3){
            throw new ArgumentsListException("Ошибка. Задано слишком много аргументов.");
        }
        Action action = Actions.find(actionName);
        return action.execute(args);
    }
}
