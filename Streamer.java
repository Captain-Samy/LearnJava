import java.util.Scanner; //impoert the Scanner class for user input


public class Streamer {
    String streamerName;
    String streamerMainGame;
    int streamerSubCounter;

    //Constructor method
    public Streamer(String name, String mainGame, int subCounter){
        streamerName = name;
        streamerMainGame = mainGame;
        streamerSubCounter = subCounter;
    }


    //toString() description
    public String toString() {
        String description = streamerName + " is a streamer who plays mostly " + streamerMainGame + " and has a subcount of " + streamerSubCounter + " Twitch!";
        return description;
    }

    //add Subs to Subcounter
    public void addSubs(int amount) {
        int newSubCounter = streamerSubCounter + amount;
        streamerSubCounter = newSubCounter;
    
    //subtract Subs from Subcounter
    }
    public void subSubs(int amount) {
        int newSubCounter = streamerSubCounter - amount;
        streamerSubCounter = newSubCounter;

    }


    //main method
    public static void main(String[] args) {
        //Create the Scanner for user input
        Scanner myObjScanner = new Scanner(System.in);
        //Talk to user 
        System.out.println("Enter 1. name, 2. mostly played game and 3. subcount: ");
        //Get user Input
        String name = myObjScanner.nextLine();
        String game = myObjScanner.nextLine();
        int subcount = myObjScanner.nextInt();
        //Create Streamer class object
        Streamer newStreamer = new Streamer(name, game, subcount); 
        //print description of the Streamer
        System.out.println(newStreamer.toString());




    }
}