package com.company.entities;

public abstract class Triangle {

    private Horizontal line;

    public Triangle(){
        this.line = new Horizontal();
    }

    public abstract String drawTriangle(int number);
//
//
//    public String drawDiamond(int number) {
//        String result = drawIsoscelesTriangle(number);
//
//        for (int i = number; i == 0; i -= 2){
//            result += "\t" + drawHorizontalLine(i) + "\t" + "\n";
//        }
//
//        return result;
//    }

    public Horizontal getLine() {
        return line;
    }

}
