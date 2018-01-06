package com.company.entities;

public class Triangle {

    private Horizontal line;

    public Triangle(){
        this.line = new Horizontal();
    }

    public String drawRightTriangle(int number){
        String result = "";
        for(int i = 1; i <= number; i++)
        {
            result += this.line.print(i);
        }
        return result;
    }

//    public String drawIsoscelesTriangle(int number) {
//        String result = "";
//        for (int i = 1; i < number * 2; i += 2){
//            result += "\t" + drawHorizontalLine(i) + "\t" + "\n";
//        }
//        return result;
//    }
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

    public void setLine(Horizontal line) {
        this.line = line;
    }
}
