public class ArrayOps {
    public static void main(String[] args) {
        
        System.out.println(containsTheSameElements(new int[] {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 3}));
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
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int large, secondLarger;

        large = secondLarger = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > secondLarger) {
                secondLarger = array[i];
            }
            if (array[i] > large) {
                large = array[i];

            }
        }
        return secondLarger;
    }


    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean found = true;

        for (int i = 0; i < array1.length; i++) { //((array1.length < array2.length) ? array2.length : array1.length)
            // found = false -- continues on to the next index until it is true
            found = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                }
            }
            if (found == false) {
                break;
            }
        }
        return found;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        if (array.length <= 1) {
            return true;
        }

        boolean minOrMax = array[0] < array [1];
        
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
