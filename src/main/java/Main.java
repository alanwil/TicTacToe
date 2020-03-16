import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Controller controller = new Controller();
        Scanner inputNumber = new Scanner(System.in);

        int number;
        Player player1 = new Player();
        Player player2 = new Player();
        Player currentPlayer = player1;

        while (controller.isGameRunning()){
            System.out.println(currentPlayer.getName() + "'s turn");
            board.draw();
            System.out.println("Select number:");
            number = inputNumber.nextInt();
            board.addSymbol(currentPlayer.getSymbol(), number);
            if (controller.checkThree(board.getBoard())){
                System.out.println(currentPlayer.getName() + " wins");
                break;
            }
            if (controller.isFullBoard(board.getBoard())){
                System.out.println("Draw");
                break;
            }

            currentPlayer = currentPlayer == player1 ? player2 : player1;

        }
    }

}
