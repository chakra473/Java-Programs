package PracticeProblems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrepInstProblems pip=new PrepInstProblems();
        //program to find whether the number is prime or not using recursion;
        int i=2;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number to find whether it is prime or not: ");
        int num=scan.nextInt();
        //Ternary operation to print num is prime or not;
        String res=pip.isPrime(num,i)?num+" is prime number":num+" is not prime number";
        System.out.println(res);
        //program to find out prime numbers within a given range;
        int lowerLimit=1;
        int upperLimit=10000;
        for(int j=lowerLimit;j<=upperLimit;j++)
        {
            if(pip.isPrime(j,2))
                System.out.print(j+",");
        }
        System.out.println();
        //program to find whether the number is palindrome or not
        String result=pip.palindrome(num)==num?num+" is palindrome":num+" is not a palindrome";
        System.out.println(result);
        //program to find the fibonocci series unto nth number
        pip.fibonocci_series(num);
        System.out.println();
        //program to find the power of the base number;
        int result1=pip.find_power(15,2);
        System.out.println(result1);
        //program to sort the array ;
        int []arr={12,43,1,49,14,99};
        System.out.println("Array before sorting");
        for (int ints:
             arr) {
            System.out.print(ints+",");
        }
        System.out.println();
        int []arr1=pip.sort_array_ascending(arr);
        System.out.println("Array after sorting");
        for (int ints:
                arr) {
            System.out.print(ints+",");
        } System.out.println();
        //program to find square root of the number
        double result2=pip.square_root(num);
        System.out.println("Square root of "+num+" is "+result2);
        //program to find whether the number is perfect square or not;
        int n=121;
        String perfect_square=pip.perfect_square(n)?n+" is perfect square":n+" is not perfect square";
        System.out.println(perfect_square);

    }
}
