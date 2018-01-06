package com.company.entities;

public class OneAsterisk extends Line{


    public String print(){
        return print(1, Line.ASTERISK);
    }

    @Override
    public String print(int number, String character) {
        return character;
    }
}
