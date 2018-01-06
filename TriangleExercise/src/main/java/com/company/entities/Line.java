package com.company.entities;

public  abstract class Line {

    private int characters;
    protected static final String ASTERISK = "*";
    protected  static final String LINE_ENTER = "\n";

    public abstract String print(int number);
}
