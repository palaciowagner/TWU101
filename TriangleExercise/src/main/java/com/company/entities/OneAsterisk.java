package com.company.entities;

public class OneAsterisk extends Line{

    public String print(){
        return print(1);
    }

    @Override
    public String print(int number) {
        return ASTERISK;
    }
}
