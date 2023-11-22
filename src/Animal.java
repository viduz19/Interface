interface Animal {
    abstract void getparts(int hands,int legs);
}
class Dog implements Animal{
    @Override
    public void getparts(int hands, int legs) {
        System.out.println("Hands :-" + hands + "," + " Legs :-" + legs);
    }
}
class Test{
    public static void main(String[] args) {
        Dog d=  new Dog();
        d.getparts(2,2);
    }
}