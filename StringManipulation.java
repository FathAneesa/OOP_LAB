public class StringManipulation {

    public static void main(String[] args) {

        // a. Create new strings using new
        String str1 = new String("Hello");
        String str2 = new String("World");
        System.out.println("a. New strings created:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // b. Getting string length
        int length = str1.length();
        System.out.println("\nb. Length of str1: " + length);

        // c. String concatenation
        String str3 = str1 + " " + str2;
        System.out.println("\nc. Concatenated string: " + str3);

        // d. Character extraction
        char ch = str1.charAt(1);  // Gets the character at index 1
        System.out.println("\nd. Character at index 1 of str1: " + ch);

        // e. String comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("\ne. Are str1 and str2 equal? " + isEqual);

        // f. Searching substrings
        int index = str3.indexOf("World");
        System.out.println("\nf. Index of 'World' in str3: " + index);

        // g. Modifying a string (Strings are immutable, so a new one is created)
        String modifiedStr = str3.replace("World", "Java");
        System.out.println("\ng. Modified string: " + modifiedStr);

        // h. Data conversion using valueOf
        int number = 100;
        String numStr = String.valueOf(number);
        System.out.println("\nh. Converted integer to string: " + numStr);
    }
}

