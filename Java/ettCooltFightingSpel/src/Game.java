import java.util.Scanner;

public class Game {


    private Player p1;
    private Player p2;

    private Combat combat;


    public Game(){

        while(true){
            printMenu();
            int input = IntputHandler.getIntFromInput();
            if (input == 0 ){
                break;
            }
            if (input == 1){
                Combat c = new Combat(new Player("Bill"), new Player("The Monster"));
            }
        }
    }

    public void printMenu(){
        System.out.println("Choose an option:");
        System.out.println("1. Fight!");
        System.out.println("0. Give up.");
    }


}
