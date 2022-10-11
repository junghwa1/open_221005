package PROJECT221005;

interface Shape5{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다.");
        draw();
    }
}

class Circle5 implements Shape5 {
    private int size=0;
    public Circle5(int size){this.size = size;}

    @Override
    public void draw() {
        System.out.println("반지름이 " + size +"인 원입니다.");
    }

    @Override
    public double getArea() {
        double cal = size * size * PI;
        return cal;
    }
}

public class ex5_13 {
    public static void main(String[] args) {
        Shape5 donut = new Circle5(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}
