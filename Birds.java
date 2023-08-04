package org.example;

public class Birds {
    String Kind;
    int Age;
    double Weight;

    Birds(){}

    Birds(String Kind_, int Age_, double Weight_){
        Kind = Kind_;
        Age = Age_;
        Weight = Weight_;
    }

    public void Chiric(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Chiric-chiric");
        }
    }
}
