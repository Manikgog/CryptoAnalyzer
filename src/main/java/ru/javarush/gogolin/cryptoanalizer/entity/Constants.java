package ru.javarush.gogolin.cryptoanalizer.entity;

import java.io.File;

public class Constants {
    private final static String rus = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
    private final static String eng = "abcdefghijklmnopqrstuvwxyz";
    public final static String alphabet = rus + eng;
    public final static String TXT_FOLDER = System.getProperty("user.dir")
            + File.separator + "text" + File.separator;
}
