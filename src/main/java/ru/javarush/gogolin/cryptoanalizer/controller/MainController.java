package ru.javarush.gogolin.cryptoanalizer.controller;

import ru.javarush.gogolin.cryptoanalizer.action.Decoder;
import ru.javarush.gogolin.cryptoanalizer.action.Encoder;
import ru.javarush.gogolin.cryptoanalizer.entity.Result;

public class MainController {

    private final Encoder encoder;
    private final Decoder decoder;

    public MainController(){
        encoder = new Encoder();
        decoder = new Decoder();
    }

    public Result doAction(String action, String[] args){
        return null;
    }
}
