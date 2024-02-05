package ru.javarush.gogolin.cryptoanalizer.action;

import java.util.List;

public interface ReaderFile {
    List<String> readFile(String src);
    List<String> readExample(String example);
}
