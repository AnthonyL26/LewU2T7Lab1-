import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();

        System.out.println("String Length: " + str1.length());
        System.out.println("First half: " + str1.substring(0,str1.length()/2));
        System.out.println("Second half: " + str1.substring(str1.length()/2));

        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        if(str2.length()>str1.length()) {
            System.out.println(str2 + " is larger than " + str1);
        }
        else if(str2.length()<str1.length()) {
            System.out.println(str1 + " is larger than " + str2);
        }
        else if(str2.length()==str1.length()) {
            System.out.println("Both strings have the same length");
        }

        if(str1.compareTo(str2) > 0){
            System.out.println(str2 + " is first alphabetically");
        }
        else if(str2.compareTo(str1) > 0){
            System.out.println(str1 + " is first alphabetically");
        }
        else if(str2.equals(str1)){
            System.out.println("Both Strings have the exact same characters");
        }

        if (str1.indexOf(str2) >= 0) {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        }
        else if (str2.indexOf(str1) >= 0) {
            System.out.println(str1 + " is found in " + str2+ " at index " + str2.indexOf(str1));
        }
        else{
            System.out.println(str2 + " is NOT found in " + str1);
        }

    }
}