/**
 * Created by jayme on 7/17/2017.
 */
public class GameCharacter {
    public String name; //variables
    public int strength;
    public int intelligence;

    public GameCharacter(){//purpose of a blank constructor is to allow you to create an instance of a class

    }

    public GameCharacter(String name, int strength, int intelligence) {//overloaded constructor
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void Play (){//3)Add method called "Play" at GameCharacter class - this prints Name of Character and shows strength and intelligence
        //not a void method, so it must return a value
        System.out.println("Name: " + name);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence); //will print name, space, strength, space and intelligence space

    }
}
