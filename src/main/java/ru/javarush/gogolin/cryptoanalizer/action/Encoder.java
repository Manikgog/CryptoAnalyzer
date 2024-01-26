package ru.javarush.gogolin.cryptoanalizer.action;

import ru.javarush.gogolin.cryptoanalizer.entity.Result;

import static ru.javarush.gogolin.cryptoanalizer.entity.Constants.alphabet;

public class Encoder implements Action {
    @Override
    public Result execute() {
        return null;
    }

    public static String encode(String str, int shift) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            String lowCase = str.toLowerCase();
            int indexOf = alphabet.indexOf(lowCase.charAt(i));
            if (Math.abs(shift) > alphabet.length()) {
                shift %= alphabet.length();
            }
            if (indexOf != -1) {
                indexOf += shift;

                if (indexOf >= alphabet.length()) {
                    indexOf %= alphabet.length();
                }
                else if(indexOf < 0){
                    if(Math.abs(indexOf) > alphabet.length()){
                        indexOf %= alphabet.length();
                    }
                    indexOf = alphabet.length() + indexOf;
                }
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ||
                        str.charAt(i) >= 'А' && str.charAt(i) <= 'Я') {
                    String upCaseStr = alphabet.toUpperCase();
                    newStr.append(upCaseStr.charAt(indexOf));
                } else {
                    newStr.append(alphabet.charAt(indexOf));
                }
            }else {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}
