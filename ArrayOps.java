public class ArrayOps {
    public static void main(String[] args) {

        int[] testCase1 = {3, 0, 1};

        System.out.println(findMissingInt(testCase1));
    }
    
    public static int findMissingInt (int[] array) {
        // Write your code here:
        int n = array.length;

            // for loops have a condition / as long as the condition is true - the for loop runs 
        for (int i = 0; i <= n; i++) {
            boolean number = false;
            for (int index = 0; index < array.length; index++) {
                if (array[index] == i) {
                    number = true;
                }
            }
            if (number == false) {
               return i; 
            }
            return -1;
        }
    }

    public static int secondMaxValue(int [] array) {
        int large, secondLarger;

        large = secondLarger = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > secondLarger) {
                secondLarger = array[i];
            }
            if (array[i] > large) {
                secondLarger = large;
                large = array[i];

            }
        }
        return secondLarger;
    }


    public static boolean containsTheSameElements(int [] array1,int [] array2) {

        for (int i = 0; i < array1.length; i++) { //((array1.length < array2.length) ? array2.length : array1.length)
            // found = false -- continues on to the next index until it is true
            int fromArray = array1[i];
            boolean found = true;
        
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                }
            }
            if (found == false) {
                return false;
            }
        }
        
        for (int i = 0; i < array2.length; i++) { //((array1.length < array2.length) ? array2.length : array1.length)
            // found = false -- continues on to the next index until it is true
            int fromArray = array2[i];
            boolean found = true;
        
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                }
            }
            if (found == false) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        if (array.length <= 1) {
            return true;
        }

        boolean minOrMax = array[0] < array[1];
        
        for (int i = 0; i < array.length; i++) {
            if (minOrMax) {
                if (array[i - 1] > array[i]) {
                    return false;
                }
            } else {
                if (array[i - 1] < array[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

