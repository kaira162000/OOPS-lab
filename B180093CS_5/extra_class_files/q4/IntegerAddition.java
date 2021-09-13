package com.chandana.q4;

public class IntegerAddition extends Addition {
    int a;
    int b;
    public IntegerAddition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println(this.a + this.b);
    }
}
