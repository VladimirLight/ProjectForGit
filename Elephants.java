package org.example;

public class Elephants {
    String Kind;
    int Age;
    double Weight;

    Elephants(){}

    Elephants(String Kind_){
        Kind = Kind_;
    }

    Elephants(String Kind_, int Age_, double Weight_){
        Kind = Kind_;
        Age = Age_;
        Weight = Weight_;
    }

    public void trumpet (){
        System.out.println("UUUU!");
    }
}
