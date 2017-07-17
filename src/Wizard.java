/**
 * Created by jayme on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {//includes same parameters as MUC plus its own
    private int spellNumber;

    public Wizard(){

    }

    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    public void Play() {//overrides MagicUsingCharacter
        System.out.println("Class: Wizard");
        super.Play();
        System.out.println("Spell number: " + spellNumber);

    }
}
