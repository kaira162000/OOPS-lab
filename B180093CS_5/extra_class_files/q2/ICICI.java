package com.chandana.q2;
import java.lang.Math;

public class ICICI extends Bank {
    public ICICI(double amount) {
        interest_percent = 6;
        this.amount = amount;
        this.interest = (amount*interest_percent)/100;
    }

    public void display_interest() {
        System.out.println("ICICI interest is: " + Math.round(this.interest));
    }
}   
