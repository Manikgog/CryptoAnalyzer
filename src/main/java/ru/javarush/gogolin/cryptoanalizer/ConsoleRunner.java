package ru.javarush.gogolin.cryptoanalizer;

import ru.javarush.gogolin.cryptoanalizer.action.Decoder;
import ru.javarush.gogolin.cryptoanalizer.action.Encoder;
import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
//        Application app = new Application();
//        Result result  = app.run(args);

        String str = "Привет, Мир!";
        Scanner scanner = new Scanner(System.in);
        int shift = scanner.nextInt();
        String encodedString = Encoder.encode(str, shift);
        System.out.println(encodedString);
        shift *= -1;
        System.out.println(Decoder.decode(encodedString, shift));
    }




}
