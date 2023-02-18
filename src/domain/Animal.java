package domain;

public class Animal {

    protected String name;
    protected float weight;

    public Animal() {
        name="animal";
        weight=30;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void speak() {
        System.out.println("Animal is speaking...");
    }

    @Override
    public String toString() {
        return "Animal:" + "\nName: " + name + "\nWeight: " + weight+" kg";
    }
 
}
