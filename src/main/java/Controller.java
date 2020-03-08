public class Controller {
    private boolean win;
    private boolean fullBoard;

    public boolean checkThree(char[][] b){
        char c1 = b[0][0];
        char c2 = b[2][0];
        char c3 = b[4][0];
        char c4 = b[0][2];
        char c5 = b[2][2];
        char c6 = b[4][2];
        char c7 = b[0][4];
        char c8 = b[2][4];
        char c9 = b[4][4];

        if (c1 == c2 && c2 == c3 && (c1 == 'X' || c1 == 'O') ||
                c4 == c5 && c5 == c6 && (c4 == 'X' || c4 == 'O')||
                c7 == c8 && c8 == c9 && (c7 == 'X' || c7 == 'O')||
                c1 == c4 && c4 == c7 && (c1 == 'X' || c1 == 'O')||
                c2 == c5 && c5 == c8 && (c2 == 'X' || c2 == 'O')||
                c3 == c6 && c6 == c9 && (c3 == 'X' || c3 == 'O')||
                c1 == c5 && c5 == c9 && (c1 == 'X' || c1 == 'O')||
                c3 == c5 && c5 == c7 && (c3 == 'X' || c3 == 'O')){
            win = true;
            return true;
        }
        return false;
    }

    public boolean isFullBoard(char[][] b){
        char c1 = b[0][0];
        char c2 = b[2][0];
        char c3 = b[4][0];
        char c4 = b[2][0];
        char c5 = b[2][2];
        char c6 = b[2][4];
        char c7 = b[4][0];
        char c8 = b[4][2];
        char c9 = b[4][4];

        if (Character.isLetter(c1) &&
                Character.isLetter(c2) &&
                Character.isLetter(c3) &&
                Character.isLetter(c4) &&
                Character.isLetter(c5) &&
                Character.isLetter(c6) &&
                Character.isLetter(c7) &&
                Character.isLetter(c8) &&
                Character.isLetter(c9)){
            fullBoard = true;
            return true;
        }
        return false;
    }

    public boolean isGameRunning() {
        if (win){
            return false;
        } else return !fullBoard;
    }
}
