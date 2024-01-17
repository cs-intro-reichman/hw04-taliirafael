public class ArrayOps {
    public static void main(String[] args) {

        int[] testCase1 = {1, 0, 3};

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
        }
        return 1;
    }

    public static int secondMaxValue(int [] array) {
        int l = array.length;
        int large = 0;
        int secondLarger = 0;

        for (int i = 0; i < l; ++i) {
            if (array[i] >= secondLarger) {
                secondLarger = large;
                large = array[i];
            }
        }
        return secondLarger;
    }


    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int n = array1.length;
        int m = array2.length;

        for (int i = 1; i < n; i++ ) { // first array check
           for (int j = 0; j < m; j++) { // second array check
            if (array1[i] == array2[j]) {
                break;
            }
            else if (j == (m - 1)) {
                return false;
            }
           } 
        }
       
        for (int j = 1; j < m; j++ ) { // first array check
            for (int i = 0; i < n; i++) { // second array check
             if (array2[j] == array1[i]) {
                 break;
             }
             else if (i == (n - 1)) {
                 return false;
             }
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
        
        for (int i = 1; i < array.length; i++) {
            if (minOrMax) {
                if (array[i - 1] > array[i]) {
                    return false;
                }
            } else if (array[i - 1] < array[i]) {
                    return false;
                }
            }
            return true;
        
    }
}




