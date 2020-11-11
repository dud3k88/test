public class Triangle implements Shape{

    private int a = 10;
    private int b = 22;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double add(int a, int b) {
        return a + b;

    }




}
