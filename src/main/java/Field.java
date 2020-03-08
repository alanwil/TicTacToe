public enum Field {
    ONE(0,0),
    TWO(2,0),
    THREE(4,0),
    FOUR(0,2),
    FIVE(2,2),
    SIX(4,2),
    SEVEN(0,4),
    EIGHT(2,4),
    NINE(4,4);

    int indexX;
    int indexY;

    Field(int indexX, int indexY){
        this.indexX = indexX;
        this.indexY = indexY;
    }
}
