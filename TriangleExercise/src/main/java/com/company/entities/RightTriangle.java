package com.company.entities;

public class RightTriangle extends Triangle {

    public String draw(int number) {
        String result = "";
        for(int i = 1; i <= number; i++)
        {
            result += this.getLine().print(i, Line.ASTERISK);
            result += Line.LINE_ENTER;
        }
        return result;
    }
}
