package com.company.entities;

public class Isosceles extends Triangle {

    @Override
    public String draw(int number){
        String result = "";

        int lastLineCharacters = (2 * number) - 1;

        for (int i = 1, j = lastLineCharacters / 2; i <= lastLineCharacters; i += 2, j--)
        {
            result += this.getLine().print(j, Line.WHITE_SPACE);
            result += this.getLine().print(i, Line.ASTERISK);
            result += this.getLine().print(j, Line.WHITE_SPACE);
            result += Line.LINE_ENTER;
        }
        return result;
    }
}
