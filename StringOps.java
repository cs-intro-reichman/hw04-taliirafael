public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    /**
     * @param args
     */
    public static void main(String[] args) {
    

    public static String capVowelsLowRest (String s) {
        // Write your code here:
        String lowerCaseString = "";
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            // lower case vowels to upper case
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
                lowerCaseString += (char)(s.charAt(i) + 32);
            }
        else {
                    lowerCaseString += s.charAt(i);
            }
        }
    return lowerCaseString;
    }


    public static char characterToUpperCase (char ch) {

        // check if lower case character
        if (ch >= 97 && ch <= 122) {
            return (char) (ch - 32);
        }

        return ch;
    }
    
    public static char characterToLowerCase (char ch) {

        // check if lower case character
        if (ch >= 65 && ch <= 90) {
            return (char) (ch + 32);
        }
        return ch;
    }

    public static String camelCase (String s) {
        // Write your code here:
        String letter = "";

        for (int i = 0; i < s.length(); ++i) {
            while (s.charAt(i) == ' ') {
                ++i;
            }
            // upper case to lower case +32
            // lower case to upper case -32
        if (letter != "" && s.charAt(i - 1) == ' ') {
            //letter += characterToUpperCase(s.charAt(i));
           // upperCaseString += (char)(s.charAt(i) + 32);
        } else {
           // lowerCaseString += (char)(s.charAt(i) - 32);
           letter += characterToLowerCase(s.charAt(i));
        }
        }

        return letter;
    }


    public static int[] allIndexOf (String str, char chr) {
        int count = 0;
        // for loop inside the for loop

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr); {
            count ++;
        }
    }

        int[] result = new int[count];
        int index = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                result[index++] = i;
            }
        }

        return result;
    }

    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println("}");
    }
}
    }
