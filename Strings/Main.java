package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello and welcome!'\n'Enter the string;");
        String palindrome=sc.nextLine();
        SubStringPalindrome.longestPalSubstr(palindrome);
        OddAndReverse oddReverse=new OddAndReverse();
        oddReverse.odd_reverse("OBSERVATION");
        ReverseString rs=new ReverseString();
        rs.reverse_string_sentence("this is reversed string");
        rs.reverse_string("im bhuvi");
        int[] arr={1,4,2,6,1};
        System.out.println(arr[(arr.length)-1]);
        RearrangeSubString.rearrangeString("abcd","acbd");
    }

}
