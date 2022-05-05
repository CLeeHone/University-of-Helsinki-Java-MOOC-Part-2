public class Program {
 
    public static void main(String[] args) {
        // Test the MagicSquare class here
 
        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare magicSquare = new MagicSquare(3);
 
        magicSquare.placeValue(0, 0, 1);
        magicSquare.placeValue(0, 1, 2);
        magicSquare.placeValue(0, 2, 3);
        magicSquare.placeValue(1, 0, 4);
        magicSquare.placeValue(1, 1, 5);
        magicSquare.placeValue(1, 2, 6);
        magicSquare.placeValue(2, 0, 7);
        magicSquare.placeValue(2, 1, 8);
        magicSquare.placeValue(2, 2, 9);
 
        System.out.println(magicSquare);
        
        System.out.println("imperfect magic square:");
        System.out.println("sum of diagonals = " + magicSquare.sumsOfDiagonals());
        System.out.println("sum of columns = " + magicSquare.sumsOfColumns());
        System.out.println("sum of rows = " + magicSquare.sumsOfRows());
        System.out.println("----------");
 
        
        MagicSquare newMagicSquare = msFactory.createMagicSquare(3);
        System.out.println("perfect magic square:");
        System.out.println("sum of diagonals = " + newMagicSquare.sumsOfDiagonals());
        System.out.println("sum of columns = " + newMagicSquare.sumsOfColumns());
        System.out.println("sum of rows = " + newMagicSquare.sumsOfRows());
    }
}