package Evaluation_3;

class Arithmetic implements Test{

    @Override
    public void square(int i) {
        int result = i*i;
        System.out.println("Square is::"+i);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.square(5);
    }
}
//
//Output-
//        Square is::5
