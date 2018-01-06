package com.company.entities;

public class Vertical extends Line {


    @Override
    public String print(int number, String character) {
        String result = "";
        for(int i = 0; i < number; i++){
            result += character + LINE_ENTER;
        }
        return result;
    }
}
