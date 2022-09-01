package personal;

public class CircleDriverClass {
    public static void main(String[] args) {
//        Circle myCircle = new Circle(4);
//        double area = myCircle.calculateArea();
//        System.out.printf("area of my cicle is %.2f", area);
//
//        double perimeter = myCircle.calculatePerimeter();
//        System.out.println("perimeter of my circle is %.2f");

        double result = calculatePerimeter(4);
        System.out.println(result);

        double sum = calculateArea(6);
        System.out.println(sum);
}

public static double calculatePerimeter(double radius){
    return 2 * Math.PI * radius;
}

public static double calculateArea(double radius){
    return  Math.PI * radius * radius;
}

}
