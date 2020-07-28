package cmsc204lab4;

/**
 * This class contains a method to calculate 
 * sum of array elements from last index recursively.
 * @author Gabriel I Feliz
 */
public class ArraySum {
    
    /**
     * No-arg constructor
     */
    public ArraySum() {
        
    }

    /**
     * This method recursively calculates 
     * the sum of array elements from last index.
     * @param myArray array of integers
     * @param lastIdx last index in array 
     * @return sum of array elements
     */
    public int sumOfArray(Integer[] myArray, int lastIdx) {
        if (lastIdx < 0) {
            return 0;
        } else {
            return myArray[lastIdx] + sumOfArray(myArray, lastIdx - 1);
        }
    }
    
}
