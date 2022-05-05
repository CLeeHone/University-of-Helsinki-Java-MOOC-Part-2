package validating;
 
public class Calculator {
 
    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative (>= 0)");
        }
        
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
 
        return answer;
    }
 
    public int binomialCoefficent(int setSize, int subsetSize) {
        if (subsetSize <= setSize) {
            throw new IllegalArgumentException("Subset size cannot exceed set size");
        }
        
        if (subsetSize < 0 || setSize < 0) {
            throw new IllegalArgumentException("Subset and set size must be non-negative(>= 0)");
        }
            
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
 
        return numerator / denominator;
    }
}