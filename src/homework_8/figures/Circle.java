package homework_8.figures;

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

