/**
 * Created by jayme on 7/17/2017.
 */
public class Warrior extends GameCharacter {//Warrior IS-A // subclass of GameCharacter
    private String weaponType;

    public Warrior(){//object Warrior

    }
    public Warrior(String name, int strength, int intelligence, String weaponType) {//parameters from GameCharacter + weapontype
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void Play (){
        System.out.println("Class: Warrior");
        super.Play();
        System.out.println("Weapon type: " + weaponType);
    }

    }
