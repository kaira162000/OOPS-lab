package com.chandana.q4;

public class FractionAddition extends Addition {
    int n1; 
    int d1; 
    int n2; 
    int d2;

    private int gcd(int n, int d) {
        if(n == 0)
            return d;
        return gcd(d%n, n);
    }

    public FractionAddition(int n1, int d1, int n2, int d2) {
        this.n1 = n1;
        this.n2 = n2;
        this.d1 = d1;
        this.d2 = d2;
    }
    public void add() {
        int den = d1*d2;
        int num = n1*d2 + n2*d1;
        int divisor = gcd(num, den);
        num = num/divisor;
        den = den/divisor;
        System.out.println(num + "/" + den);
    }
}