public class MagicSquareFactory {
 
    //method
    public MagicSquare createMagicSquare(int size) {
 
        MagicSquare square = new MagicSquare(size);
        int row = 0;
        int column = (size - 1) / 2;
        int number = 1;
        int wholeSquare = size * size;
 
        //set '1' at the center of the first row
        square.placeValue(row, column, number);
        number++;
 
        for (int i = 0; i < wholeSquare; ++i) {
 
            if (square.readValue(row - 1, column) == -1 && row == 0) { //if move diagonal right is out of top bounds
                if (row == 0 && column == size - 1) {
                    square.placeValue(row + 1, column, number);
                    ++row;
                    ++number;
                }
                if (column == size - 1) {
                    square.placeValue(row - 1, 0, number);
                    --row;
                    column = 0;
                    ++number;
                }
                square.placeValue(size - 1, column + 1, number);
                row = size - 1;
                ++column;
                ++number;
 
            } else if (square.readValue(row - 1, column + 1) == -1 && column == size - 1) { // if move diagonal right is out of right bounds
                square.placeValue(row - 1, 0, number);
                row -= 1;
                column = 0;
                ++number;
 
            } else if (square.readValue(row - 1, column + 1) == 0) {
                square.placeValue(row - 1, column + 1, number);
                row -= 1;
                ++column;
                ++number;
            } else {
                square.placeValue(row + 1, column, number);
                ++row;
                ++number;
            }
        }
        return square;
    }
}