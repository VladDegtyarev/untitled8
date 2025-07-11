package homework_8.figures;

import homework_8.figures.Figure;

public class Triangle extends Figure {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle (double base,double height,double sideA,double sideB){
        this.base=base;
        this.height= height;
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return  base+sideA+sideB;
    }
}

