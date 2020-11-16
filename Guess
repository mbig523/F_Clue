import java.util.Scanner;

public class Guess {
    Scanner scan = new Scanner(System.in);
    private String weapon;
    private String room;
    private String suspect;

    //All guess for now make use of scanners to input what they choose as a guess.
    //Need to implement an if, if a guess isn't in the values of the thing then it
    //will output an error and ask for a retry.
    public void guessRoom(){
        System.out.println("Choose what room you think the murder happened in?");
        System.out.print("(Ball Room, Billiard Room, Conservatory, Dining Room, Hall, Kitchen, Lounger, Library, Study): ");
        room = scan.nextLine();
        System.out.println();
    }

    public void guessWeapon(){
        System.out.println("Choose what you think was used to commit the murder?");
        System.out.print("(Knife, Revolver, Rope, Wrench, Candlestick, Lead pipe): ");
        weapon = scan.nextLine();
        System.out.println();
    }

    public void guessSuspect(){
        System.out.println("Choose who you think committed the murder?");
        System.out.print("(Mrs. White, Mrs. Peacock, Professor Plum, Colonel Mustard, Miss Scarlet, Reverend Green, Mr. Boddy): ");
        suspect = scan.nextLine();
        System.out.println();
    }
    
    public void Guesses(){
        System.out.println("Your guesses are: ");
        System.out.println("Room: " + room);
        System.out.println("Weapon: " + weapon);
        System.out.println("Suspect: " + suspect);
    }
}
