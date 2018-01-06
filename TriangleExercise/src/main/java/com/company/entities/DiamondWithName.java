package com.company.entities;

public class DiamondWithName extends Shape{

    @Override
    public String draw(int number) {
        int lastLineCharacters = (2 * number) - 1;

        Isosceles isosceles = new Isosceles();
        String result = isosceles.drawUp(lastLineCharacters);
        result += "Wagner\n";
        result += isosceles.drawUpsideDown(lastLineCharacters);
        return result;
    }


}
