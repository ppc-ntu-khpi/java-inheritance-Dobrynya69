package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;
    protected float weight;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name="animal";
        weight=30;
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Animal is eating...");
    }


/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Animal is speaking...");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Animal:" + "\nName: " + name + "\nWeight: " + weight+" kg";
    }
 
}
