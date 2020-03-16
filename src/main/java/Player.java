import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;

    public Player() {
        System.out.println("Enter your name:");
        try {
            Scanner input = new Scanner(System.in);
            name = input.next();
        } catch (NullPointerException e){
            System.out.println("No name specified");
        }

        System.out.println("Chose your symbol");
        try {
            Scanner input = new Scanner(System.in);
            symbol = input.next().charAt(0);
        } catch (NullPointerException e){
            System.out.println("No symbol specified");
        }
    }

    public void play(){

    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
