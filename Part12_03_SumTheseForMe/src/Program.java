public class Program {
 
    public static void main(String[] args) {
        int[] numbers = {8, -2, 3, 1, 1, 1, 2, 3};
        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
        System.out.println(sum(numbers, 5, numbers.length, 0, 999));
    }
 
    public static int sum(int[] array, int fromIndex, int toIndex, int smallest, int largest) {
        int sum = 0;
 
        if (fromIndex < 0) {
            fromIndex = 0;
        }
 
        if (toIndex > array.length) {
            toIndex = array.length;
        }
 
        for (int i = fromIndex; i < toIndex; i++) {
            if (array[i] <= largest && array[i] >= smallest) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}