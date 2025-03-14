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
        int numOfXs = 0;
        int numOfOs = 0;
        for (int i = 0; i < matrix.length; i++) { //moves thru rows
            for (int j = 0; j < matrix[i].length; j++) { //moves thru columns
                if (matrix[i][j] == 'X') {
                    numOfXs++;
                } else if (matrix[i][j] == 'O') {
                    numOfOs++;
                }
            }
        }
        if (numOfXs > numOfOs && numOfXs + numOfOs != 9) {
            xInFavor = true;
        }
        return xInFavor;
        //return null;
    }

    public Boolean isInFavorOfO() {  //does O have more spaces filled in? is it O's turn?
        Boolean oInFavor = false;
        int numOfXs = 0;
        int numOfOs = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'X') {
                    numOfXs++;
                } else if (matrix[i][j] == 'O') {
                    numOfOs++;
                }
            }
        }
        if (numOfOs > numOfXs && numOfXs + numOfOs != 9) {
            oInFavor = true;
        }
        return oInFavor;
        //return null;
    }

    public Boolean isTie() { //no spaces are equal to ' '
        Boolean tied = false;
        int numOfXs = 0;
        int numOfOs = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'X') {
                    numOfXs++;
                } else if (matrix[i][j] == 'O') {
                    numOfOs++;
                }
            }
        }
        if (numOfXs + numOfOs == 9) {
            tied = true;
        }
        return tied;
        //return null;
    }

    public String getWinner() {
        String winner = "";
        for (int i = 0; i < matrix.length; i++) {
            int numOfXs = 0;
            int numOfOs = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'X') {
                    numOfXs++;
                } else if (matrix[i][j] == 'O') {
                    numOfOs++;
                }
            }
            if (numOfXs == 3) {
                winner = "X";
            }
            if (numOfOs == 3) {
                winner = "O";
            }
        }

        return winner;
        //return null;
    }

}
