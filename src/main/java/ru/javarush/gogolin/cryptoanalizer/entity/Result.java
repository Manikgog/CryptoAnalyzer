package ru.javarush.gogolin.cryptoanalizer.entity;

public class Result {
    private final String message;
    public Result(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
