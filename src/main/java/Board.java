import java.util.Scanner;

public class Board {
    private char[] board;

    public Board() {
        this.board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = (char) (i + 49);
        }
    }

    public void draw(){
        for (int i = 1; i <= board.length; i++) {
            System.out.print(this.board[i-1] + "  ");
            if (i%3 == 0){
                System.out.println();
            }
        }
    }

    public char[] getBoard() {
        return board;
    }

    private boolean isPlaceAvailable(int i) {
        if (i >= 0 && i <= 8){
            if (Character.isDigit(this.board[i])){
                return true;
            }
        }
        return false;
    }

    public void addSymbol(char c, int number){

        boolean isAvailable = isPlaceAvailable(number-1);
        while (!isAvailable){
            System.out.println("Place taken, try another one");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            //board[number-1] = c;;
            isAvailable = isPlaceAvailable(number-1);
        }
        board[number-1] = c;

    }

}
