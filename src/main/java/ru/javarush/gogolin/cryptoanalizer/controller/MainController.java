package ru.javarush.gogolin.cryptoanalizer.controller;

import ru.javarush.gogolin.cryptoanalizer.entity.Result;

public interface MainController {
    Result doAction(String action, String[] args);
}
