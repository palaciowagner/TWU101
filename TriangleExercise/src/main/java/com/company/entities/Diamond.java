package com.company.entities;

public class Diamond extends Shape{
    @Override
    public String draw(int number) {

        Isosceles isosceles = new Isosceles();
        String result = isosceles.draw(number);

        int lastLineCharacters = (2 * number) - 1;

        for (int i = 1, j = lastLineCharacters - 2; j >= 1; i++, j-=2)
        {
            result += this.getLine().print(i, Line.WHITE_SPACE);
            result += this.getLine().print(j, Line.ASTERISK);
            result += this.getLine().print(i, Line.WHITE_SPACE);
            result += Line.LINE_ENTER;
        }
        return result;
    }
}
