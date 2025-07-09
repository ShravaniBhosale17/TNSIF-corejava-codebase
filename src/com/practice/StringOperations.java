package com.practice;

public class StringOperations {
    public static void main(String[] args) {
        // String creation
        String str1 = "Hello";
        String str2 = new String("World");

        // Length
        System.out.println("Length: " + str1.length());

        // charAt
        System.out.println("charAt(1): " + str1.charAt(1));

        // Concatenation
        System.out.println("Using + : " + (str1 + " " + str2));
        System.out.println("Using concat: " + str1.concat(" ").concat(str2));

        // Comparison
        String str3 = "hello";
        System.out.println("equals: " + str1.equals(str3));
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str3));
        System.out.println("compareTo: " + str1.compareTo(str3));
        System.out.println("compareToIgnoreCase: " + str1.compareToIgnoreCase(str3));

        // substring
        System.out.println("substring(1,4): " + str1.substring(1, 4));

        // indexOf and lastIndexOf
        String str4 = "This is a test string";
        System.out.println("indexOf('is'): " + str4.indexOf("is"));
        System.out.println("lastIndexOf('is'): " + str4.lastIndexOf("is"));

        // toUpperCase, toLowerCase
        System.out.println("toUpperCase: " + str4.toUpperCase());
        System.out.println("toLowerCase: " + str4.toLowerCase());

        // trim
        String str5 = "   Trim Me   ";
        System.out.println("trim: '" + str5.trim() + "'");

        // replace
        System.out.println("replace 'is' with 'was': " + str4.replace("is", "was"));

        // replaceAll and replaceFirst
        System.out.println("replaceAll (regex): " + str4.replaceAll("\\s", "_"));
        System.out.println("replaceFirst (regex): " + str4.replaceFirst("\\s", "_"));

        // split
        String str6 = "Apple,Orange,Banana";
        String[] fruits = str6.split(",");
        System.out.println("split:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // toCharArray
        char[] chars = str1.toCharArray();
        System.out.println("toCharArray:");
        for (char c : chars) {
            System.out.println(c);
        }

        // startsWith, endsWith
        System.out.println("startsWith 'Hel': " + str1.startsWith("Hel"));
        System.out.println("endsWith 'lo': " + str1.endsWith("lo"));

        // contains
        System.out.println("contains 'ell': " + str1.contains("ell"));

        // isEmpty and isBlank
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("isEmpty: " + emptyStr.isEmpty());
        System.out.println("isBlank (Java 11+): " + blankStr.isBlank());

        // valueOf
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("valueOf int: " + numStr);

        // join
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("join: " + joined);

        // format
        String formatted = String.format("Hello %s, your score is %d", "Alice", 95);
        System.out.println("format: " + formatted);

        // intern
        String s1 = new String("InternTest").intern();
        String s2 = "InternTest";
        System.out.println("intern equality: " + (s1 == s2));

        // hashCode
        System.out.println("hashCode of str1: " + str1.hashCode());

        // Demonstrating immutability
        String immutable = "Immutable";
        String modified = immutable.concat(" String");
        System.out.println("immutable: " + immutable);
        System.out.println("modified: " + modified);

        // StringBuilder to String and vice versa
        StringBuilder sb = new StringBuilder("MutableString");
        String sbToString = sb.toString();
        System.out.println("StringBuilder to String: " + sbToString);

        String strToSb = "StringToBuilder";
        StringBuilder newSb = new StringBuilder(strToSb);
        newSb.append(" Added");
        System.out.println("String to StringBuilder: " + newSb);

        // Counting vowels
        String sentence = "Count the number of vowels in this sentence";
        int vowelCount = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);
    }
}
