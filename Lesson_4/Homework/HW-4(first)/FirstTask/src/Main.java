import utilities.NumericArraySrvc;

public class Main {
    public static void main(String[] args) {
        // Initialize NumericArraySrvc with an Integer array and type
        NumericArraySrvc<Integer> numericArraySrvc = new NumericArraySrvc<>(new Integer[10], Integer.class);
        
        // Randomly initialize the array
        numericArraySrvc.randomInit();
        
        // Print the array and its statistical properties
        System.out.println("Array: " + numericArraySrvc);
        System.out.println("Min: " + numericArraySrvc.min());
        System.out.println("Max: " + numericArraySrvc.max());
        System.out.println("Avg: " + numericArraySrvc.avg());

        // Replace an element in the array and sort in descending order
        numericArraySrvc.replace(1, 180);
        numericArraySrvc.sortDsc();
        
        // Print the updated array
        System.out.println("Updated Array: " + numericArraySrvc);
    }
}