package ru.javarush.gogolin.cryptoanalizer.exceptions;

public class ArgumentsListException extends IllegalArgumentException{
    public ArgumentsListException() {
    }

    public ArgumentsListException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
}
