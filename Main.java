package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Birds b1 = new Birds("Sokol", 7, 7);
        b1.Chiric(1);

       Dogs d1 = new Dogs("Ovcharka");
        d1.Gav();

        Cats c1 = new Cats();
        c1.Miau();

        Monkeys m1 = new Monkeys("shimpanze");
        m1.Uua();

        Lions l1 = new Lions(7,200);
        l1.roar();

        Fish f1 = new Fish("Losos", 7);

        Whales w1 = new Whales("humpback whale");
        w1.SoundOfWhales();

        Elephants e1 = new Elephants();
        e1.trumpet();







    }
}