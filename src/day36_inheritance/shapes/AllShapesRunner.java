package day36_inheritance.shapes;

public class AllShapesRunner {

    public static void main(String[] args) {
        day36_inheritance.shapes.Square obj1 = new Square(6);
        System.out.println(obj1);
        System.out.println(obj1.area());
        System.out.println(obj1.perimeter());


        System.out.println();
        day36_inheritance.shapes.Circle obj2 = new Circle(5);
        System.out.println(obj2);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());



    }
}