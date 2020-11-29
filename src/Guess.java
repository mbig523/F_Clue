import java.util.Scanner;

public class Guess { //will need a scanner in main to allow users to guess
    Scanner scan = new Scanner(System.in);
    private String weapon;
    private String room;
    private String suspect;
    private String playerName = "No Name";

    //All guess for now make use of scanners to input what they choose as a guess.
    //For now Room is set manually using switches

    public void guessRoom(){// Will automatically be set to the room that the player is in by using the board layout to locate where they are
        System.out.println("Which room do you think the murder happened in?");
        System.out.print("(Ball Room, Billiard Room, Conservatory, Dining Room, Hall, Kitchen, Lounger, Library, Study): ");
        room = scan.nextLine();

        switch(room){// Makes use of switches to control the input, if input doesn't match system will tell user to retry again
            case "Ball Room":
                this.room = room;
                System.out.println();
                break;

            case "Billiard Room":
                this.room = room;
                System.out.println();
                break;

            case "Conservatory":
                this.room = room;
                System.out.println();
                break;

            case "Dining Room":
                this.room = room;
                System.out.println();
                break;

            case "Hall":
                this.room = room;
                System.out.println();
                break;

            case "Kitchen":
                this.room = room;
                System.out.println();
                break;

            case "Lounger":
                this.room = room;
                System.out.println();
                break;

            case "Library":
                this.room = room;
                System.out.println();
                break;

            case "Study":
                this.room = room;
                System.out.println();
                break;

            default:
                System.out.println("That is not a room choice, try again.");
                System.out.println();
                guessRoom();
        }
    }

    public void guessWeapon(){
        System.out.println("Choose what you think was used to commit the murder?");
        System.out.print("(Knife, Revolver, Rope, Wrench, Candlestick, Lead pipe): ");
        weapon = scan.nextLine();

        switch(weapon) {// Makes use of switches to control the input, if input doesn't match system will tell user to retry again
            case "Knife":
                this.weapon = weapon;
                System.out.println();
                break;

            case "Revolver":
                this.weapon = weapon;
                System.out.println();
                break;

            case "Rope":
                this.weapon = weapon;
                System.out.println();
                break;

            case "Wrench":
                this.weapon = weapon;
                System.out.println();
                break;

            case "Candlestick":
                this.weapon = weapon;
                System.out.println();
                break;

            case "Lead pipe":
                this.weapon = weapon;
                System.out.println();
                break;

            default:
                System.out.println("That is not a weapon choice, try again.");
                System.out.println();
                guessWeapon();
        }
    }

    public void guessSuspect(){
        System.out.println("Choose who you think committed the murder?");
        System.out.print("(Mrs. White, Mrs. Peacock, Professor Plum, Colonel Mustard, Miss Scarlet, Reverend Green, Mr. Boddy): ");
        suspect = scan.nextLine();

        switch(suspect) {// Makes use of switches to control the input, if input doesn't match system will tell user to retry again
            case "Mrs. White":
                this.suspect = suspect;
                System.out.println();
                break;

            case "Mrs. Peacock":
                this.suspect = suspect;
                System.out.println();
                break;

            case "Professor Plum":
                this.suspect = suspect;
                System.out.println();
                break;

            case "Colonel Mustard":
                this.suspect = suspect;
                System.out.println();
                break;

            case "Miss Scarlet":
                this.suspect = suspect;
                System.out.println();
                break;

            case "Reverend Green":
                this.suspect = suspect;
                System.out.println();
                break;

            case "Mr. Boddy":
                this.suspect = suspect;
                System.out.println();
                break;

            default:
                System.out.println("That is not a weapon choice, try again.");
                System.out.println();
                guessWeapon();
        }
    }
    public void Guesses(){
        System.out.println("Your guesses are: ");
        System.out.println(playerName + " is in room: " + this.room);
        System.out.println("Weapon used for the murder was: " + this.weapon);
        System.out.println("The suspect is: " + this.suspect);

        //will use main as the parse through the hand of other players to prove the guess wrong
    }
}
