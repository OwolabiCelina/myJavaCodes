package personal;

public class Circle {
    public Circle(double radius){
        this.radius = radius;
    }
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return  Math.PI * radius * radius;
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

}

