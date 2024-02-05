package ru.javarush.gogolin.cryptoanalizer;

public class ConsoleRunner {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Application app = new Application();
        System.out.println(app.run(args));
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения программы " + (finish - start) + " мс");
    }
}
