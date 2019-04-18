package com.company;

public class LoudDog extends Dog {
    public LoudDog(String myName) {
        super(myName);
    }

    public String speak() {
        for (int i = 1; i < 3; i++) {
            return super.speak();
        }
    }
}
