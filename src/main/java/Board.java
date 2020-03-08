import java.util.Scanner;

public class Board {
    private char[][] board;

    public Board() {
        this.board = new char[5][5];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j%2 != 0){
                    board[i][j] = '|';
                }
                if (i%2 != 0){
                    board[i][j] = '-';
                }
            }
        }
    }

    public void draw(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public char[][] getBoard() {
        return board;
    }

    private boolean isPlaceAvailable(int y, int x) {
        if (board[y][x] != 'X' && board[y][x] != 'O'){
            return true;
        }
        return false;
    }

    public void addSymbol(char c, int number){
        Field field = Field.values()[number-1];
        boolean isAvailable = isPlaceAvailable(field.indexY, field.indexX);
        while (!isAvailable){
            System.out.println("Place taken, try another one");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            field = Field.values()[number-1];
            isAvailable = isPlaceAvailable(field.indexY, field.indexX);
        }
        board[field.indexY][field.indexX] = c;

    }
}
