package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {  //does X have more spaces filled in? is it X's turn?
        Boolean xInFavor = false;


        return xInFavor;
        //return null;
    }

    public Boolean isInFavorOfO() {  //does O have more spaces filled in? is it O's turn?
        Boolean oInFavor = false;


        return oInFavor;
        //return null;
    }

    public Boolean isTie() { //no spaces are equal to ' '
        Boolean tied = false;

        return tied;
        //return null;
    }

    public String getWinner() {
        String winner = "";


        return winner;
        //return null;
    }

}
