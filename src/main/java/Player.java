import java.util.Scanner;

public class Player {
    private String name;

    public Player() {
        System.out.println("Enter your name:");
        try {
            Scanner input = new Scanner(System.in);
            name = input.next();
        } catch (NullPointerException e){
            System.out.println("No name specified");
        }
    }

    public String getName() {
        return name;
    }
}
