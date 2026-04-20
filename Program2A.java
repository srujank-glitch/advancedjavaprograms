package practice.programs;

import java.util.Scanner;

public class Program2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Creation
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "   Java Programming Language   ";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);

        // Basic Operations
        System.out.println("\n--- String Creation and Basic Operations ---");
        String combined = str1 + " " + str2;
        System.out.println("Combined String: " + combined);

        // Length and Character Access
        System.out.println("\n--- Length and Character Access ---");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("\n--- String Comparison ---");
        String s1 = "apple";
        String s2 = "Apple";
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
        System.out.println("CompareTo: " + s1.compareTo(s2));

        // String Searching
        System.out.println("\n--- String Searching ---");
        System.out.println("Contains 'Java': " + str3.contains("Java"));
        System.out.println("Index of 'Programming': " + str3.indexOf("Programming"));
        System.out.println("Last Index of 'a': " + str3.lastIndexOf('a'));

        // Substring Operations
        System.out.println("\n--- Substring Operations ---");
        System.out.println("Substring from index 3: " + str1.substring(3));
        System.out.println("Substring from index 1 to 4: " + str1.substring(1, 4));

        // String Modification
        System.out.println("\n--- String Modification ---");
        String modified = str3.replace("Java", "Python");
        System.out.println("After Replace: " + modified);
        System.out.println("Upper Case: " + str1.toUpperCase());
        System.out.println("Lower Case: " + str2.toLowerCase());

        // Whitespace Handling
        System.out.println("\n--- Whitespace Handling ---");
        System.out.println("Before Trim: [" + str3 + "]");
        System.out.println("After Trim: [" + str3.trim() + "]");

        // String Concatenation
        System.out.println("\n--- String Concatenation ---");
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + concat);

        // String Splitting
        System.out.println("\n--- String Splitting ---");
        String sentence = "Java,is,a,powerful,language";
        String[] words = sentence.split(",");
        for (String word : words) {
            System.out.println(word);
        }

        // StringBuilder Demo
        System.out.println("\n--- StringBuilder Demo ---");
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(7, "Students ");
        sb.replace(0, 7, "Hello");
        System.out.println("StringBuilder Result: " + sb);

        // String Formatting
        System.out.println("\n--- String Formatting ---");
        String name = "Srujan";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted);

        // Email Validation
        System.out.println("\n--- Email Validation ---");
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        if (email.contains("@") &&
            email.startsWith("s") &&
            email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}