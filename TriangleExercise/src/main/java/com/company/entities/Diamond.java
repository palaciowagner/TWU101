package com.company.entities;

public class Diamond extends Shape{

    @Override
    public String draw(int number) {

        int lastLineCharacters = (2 * number) - 1;
        Isosceles isosceles = new Isosceles();
        String result = isosceles.draw(number);
        result += isosceles.drawUpsideDown(lastLineCharacters);
        return result;
    }
}
