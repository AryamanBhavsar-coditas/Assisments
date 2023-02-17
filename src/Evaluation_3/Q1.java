package Evaluation_3;

class Shape{
    int length;
    int breadth;
}

class Area extends Shape{
    void Calculate(){
        int result = length*breadth;
        System.out.println("Area is::"+result);
    }
}

class Perimeter extends Shape{
    void Calculate(){
        int result = 2*(length+breadth);
        System.out.println("Perimeter is::"+result);
    }
}


public class Q1 {
    public static void main(String[] args) {

        Area area = new Area();
        area.breadth=3;
        area.length=2;
        area.Calculate();

        Perimeter perimeter = new Perimeter();
        perimeter.length=5;
        perimeter.breadth=3;
        perimeter.Calculate();

    }
}
