// leetcode sol.....
/*
class Solution {
    public void reverseString(char[] s) {

       for (int i=0;i<(s.length)/2;i++){
        int l=i;
        int r=s.length-1-i;
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;

       }    
    }
}
*/
import java.util.Scanner;

public class ReverseString {

    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            int l = i;
            int r = s.length - 1 - i;

            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] s = input.toCharArray();

        reverseString(s);

        System.out.print("Reversed String: ");
        for (char ch : s) {
            System.out.print(ch);
        }

        sc.close();
    }
}
