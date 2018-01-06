package com.company.entities;

public abstract class Shape {

    private Horizontal line;

    public Shape(){
        this.line = new Horizontal();
    }

    public abstract String draw(int number);

    public Horizontal getLine() {
        return line;
    }


}
