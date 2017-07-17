/**
 * Created by jayme on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter {//MUC IS-A subclass of GC want all
    public int magicalEnergy;

    public MagicUsingCharacter(){

    }

    public MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }
    @Override
    public void Play(){
        super.Play();//override super class play parameters
        System.out.println("Magical energy: " + magicalEnergy);//adds parameter magicalEnergy

    }
}
