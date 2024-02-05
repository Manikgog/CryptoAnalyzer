package ru.javarush.gogolin.cryptoanalizer.action;

import java.util.List;

public interface WriterFile {
    void writeFile(String dst, List<String> encodedList);
}
