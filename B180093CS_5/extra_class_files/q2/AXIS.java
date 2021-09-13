package com.chandana.q2;
import java.lang.Math;

public class AXIS extends Bank {
    public AXIS(double amount) {
        interest_percent = 7;
        this.amount = amount;
        this.interest = (amount*interest_percent)/100;
    }

    public void display_interest() {
        System.out.println("AXIS interest is: " + Math.round(this.interest));
    }
}   