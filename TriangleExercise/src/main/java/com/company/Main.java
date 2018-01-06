package com.company;

import com.company.entities.*;

public class Main {

    public static void main(String[] args) {
        OneAsterisk oneAsterisk = new OneAsterisk();
        System.out.println(oneAsterisk.print());

        Horizontal horizontal = new Horizontal();
        System.out.println(horizontal.print(8, "*"));

        Vertical vertical = new Vertical();
        System.out.println(vertical.print(3, "*"));

        RightTriangle rightTriangle = new RightTriangle();
        System.out.println(rightTriangle.drawTriangle(5));

        Isosceles isosceles = new Isosceles();
        System.out.println(isosceles.drawTriangle(20));


    }

}
