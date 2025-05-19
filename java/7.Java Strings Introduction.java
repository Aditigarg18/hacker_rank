// The elements of a String are called characters. 
//   The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

// Given two strings of lowercase English letters,  A and  B, perform the following operations:

// Sum the lengths of A and B.
// Determine if A is lexicographically larger than B (i.e.: B does  come before A in the dictionary?).
// Capitalize the first letter in A and B and print them on a single line, separated by a space.
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);
        if(A.charAt(0)>B.charAt(0))System.out.println("Yes");
        else System.out.println("No");
         String aCap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String bCap = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(aCap + " " + bCap);
    }
}
