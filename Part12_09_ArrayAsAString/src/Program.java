public class Program {
 
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };
 
        System.out.println(arrayAsString(matrix));
    }
 
    public static String arrayAsString(int[][] array) {
        StringBuilder word = new StringBuilder();
 
        for (int row = 0; row < array.length; ++row) {
            for (int column = 0; column < array[row].length; ++column) {
                word = word.append(String.valueOf(array[row][column]));
            }
            word = word.append("\n");
        }
        return String.valueOf(word);
    }
}