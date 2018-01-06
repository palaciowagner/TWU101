package com.company.entities;

public class Horizontal extends Line {

    @Override
    public String print(int number){
        String result = "";
        for(int i = 0; i < number; i++){
            result += ASTERISK;
        }
        result += LINE_ENTER;
        return result;
    }
}
