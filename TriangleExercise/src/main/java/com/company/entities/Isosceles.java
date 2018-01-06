package com.company.entities;

public class Isosceles extends Triangle {

    @Override
    public String draw(int number){
        String result = "";
        int lastLineCharacters = (2 * number) - 1;
        result += drawUp(lastLineCharacters);
        result += this.getLine().print(lastLineCharacters, Line.ASTERISK);
        result += Line.LINE_ENTER;

        return result;
    }

    public String drawUp(int lastLineCharacters){
        String result = "";

        for (int i = 1, j = lastLineCharacters / 2; i < lastLineCharacters; i += 2, j--)
        {
            result += buildLine(i, j);
        }
        return result;
    }

    public String drawUpsideDown(int lastLineCharacters){
        String result = "";
        for (int i = 1, j = lastLineCharacters - 2; j >= 1; i++, j-=2)
        {
            result += buildLine(j, i);
        }
        return result;
    }

    private String buildLine(int characters, int whiteSpaces) {
        String result = "";
        result += this.getLine().print(whiteSpaces, Line.WHITE_SPACE);
        result += this.getLine().print(characters, Line.ASTERISK);
        result += this.getLine().print(whiteSpaces, Line.WHITE_SPACE);
        result += Line.LINE_ENTER;
        return result;
    }


}
