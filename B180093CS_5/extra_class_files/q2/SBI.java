package com.chandana.q2;
import java.lang.Math;

public class SBI extends Bank {
    public SBI(double amount) {
        interest_percent = 5;
        this.amount = amount;
        this.interest = (amount*interest_percent)/100.0;
    }

    public void display_interest() {
        System.out.println("SBI interest is: " + Math.round(this.interest));
    }
}   