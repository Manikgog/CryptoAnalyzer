package ru.javarush.gogolin.cryptoanalizer.controller;

import ru.javarush.gogolin.cryptoanalizer.action.Action;
import ru.javarush.gogolin.cryptoanalizer.action.BruteForce;
import ru.javarush.gogolin.cryptoanalizer.action.Decoder;
import ru.javarush.gogolin.cryptoanalizer.action.Encoder;
import ru.javarush.gogolin.cryptoanalizer.exceptions.ArgumentsListException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    BRUTEFORCE(new BruteForce());

    private final Action action;

    Actions(Action action){
        this.action = action;
    }

    public static Action find(String actionName){
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        }catch (IllegalArgumentException e){
            throw new ArgumentsListException("Не найдена указанная команда.");
        }
    }

}
