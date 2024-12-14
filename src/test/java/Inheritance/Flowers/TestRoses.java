package Inheritance.Flowers;

public class TestRoses {
    public static void main(String[] args) {
        Flower flower = new Flower("color","size",2,4);
        Rose rose = new Rose("Red","Rose bucket",2,15);
        System.out.println(rose.color);
        System.out.println(rose.name);
    }
}
