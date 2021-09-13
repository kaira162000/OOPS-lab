package com.chandana.q3;


public class Rectangle {
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return this.length*this.breadth;
        
    }

    public int perimeter() {
        return 2*(this.length+this.breadth);
    }
}
