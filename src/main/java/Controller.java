public class Controller {
    private boolean win;
    private boolean fullBoard;

    public boolean checkThree(char[] b){
        if (    (b[0] == b[1] && b[1] == b[2]) ||
                (b[3] == b[4] && b[4] == b[5]) ||
                (b[6] == b[7] && b[7] == b[8]) ||
                (b[0] == b[3] && b[3] == b[6]) ||
                (b[1] == b[4] && b[4] == b[7]) ||
                (b[2] == b[5] && b[5] == b[8]) ||
                (b[0] == b[4] && b[4] == b[8]) ||
                (b[2] == b[4] && b[4] == b[6])){
            return true;
        }
        return false;
    }

    public boolean isFullBoard(char[] b){

        if (Character.isLetter(b[0]) &&
                Character.isLetter(b[1]) &&
                Character.isLetter(b[2]) &&
                Character.isLetter(b[3]) &&
                Character.isLetter(b[4]) &&
                Character.isLetter(b[5]) &&
                Character.isLetter(b[6]) &&
                Character.isLetter(b[7]) &&
                Character.isLetter(b[8])){
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
