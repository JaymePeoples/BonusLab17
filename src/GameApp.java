import java.util.ArrayList;

/**
 * Created by jayme on 7/17/2017.
 */
public class GameApp {
    public static void main(String[] args) {
        //create an array of type GameCharacter and call it "gameCharacters" then add two warriors and three wizards
        ArrayList<GameCharacter> gameCharacters = new ArrayList<>();
        //adding characters to array list by using constructor from the classes
        gameCharacters.add(new Warrior("Bob", 10, 10, "Ax"));
        gameCharacters.add(new Warrior("Fred", 5, 4, "Spear"));
        gameCharacters.add(new Wizard("Merlin", 15, 10, 15, 3));
        gameCharacters.add(new Wizard("Lucas", 12, 20, 17, 5));
        gameCharacters.add(new Wizard("George", 4, 5, 10, 7));

        for (GameCharacter list: gameCharacters){//for loop invokes play method for all objects in array
            System.out.println();//putting the blank print statement here will put a line in between each one
            list.Play();//invoking method play which already contains sysout statements, therefore, don't need to write sysout here
        }
    }

}
