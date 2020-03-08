import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Controller controller = new Controller();
        Scanner inputSymbol = new Scanner(System.in);
        int number;
        Player player1 = new Player();
        Player player2 = new Player();
        while (controller.isGameRunning()){
            System.out.println(player1.getName() + "'s turn");
            board.draw();
            System.out.println("Select number:");
            number = inputSymbol.nextInt();
            board.addSymbol('X', number);
            if (controller.checkThree(board.getBoard())){
                System.out.println(player1.getName() + " wins");
                break;
            }
            if (controller.isFullBoard(board.getBoard())){
                System.out.println("Draw");
                break;
            }

            System.out.println(player2.getName() + "' turn");
            board.draw();
            System.out.println("Select number:");
            number = inputSymbol.nextInt();
            board.addSymbol('O', number);
            if (controller.checkThree(board.getBoard())){
                System.out.println(player2.getName() + " wins");
                break;
            }
            if (controller.isFullBoard(board.getBoard())){
                System.out.println("Draw");
                break;
            }

        }
    }
    //public static void play(Player player)
}
