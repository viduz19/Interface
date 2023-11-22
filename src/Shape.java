interface Shape {
    abstract void getAre();
    default void getSides(){
        System.out.println("Sides of this Shape");
    }
}
class Rectangle implements Shape{
    public void getAre() {
        int length = 10;
        int width = 15;
        int area = length * width;
        System.out.println("Area of Rectangle :-" + area);
    }

    public void getSides(){
        System.out.println("I have two sides");
    }
}
class Squre implements Shape {
    public void getAre() {
        int length = 20;
        int area = length * length;
        System.out.println("Area of Squre :-" + area);
    }
}
class Test2{
    public static void main(String[] args) {
        Shape r =new Rectangle();
        r.getAre();
        r.getSides();
        Shape s = new Squre();
        s.getAre();
    }
}