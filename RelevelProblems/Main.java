package RelevelProblems;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello and welcome!'\n'Enter your password;");
        String password=sc.nextLine();
        RegexPattern rp=new RegexPattern();
        rp.valid_check(password);
        System.out.println(1%10);
        PatternProblems pp=new PatternProblems();
        pp.right_angle_triangle();
        pp.inverse_right_angle_triangle();
        PatternProblems.left_triangle(5);
        PatternProblems.inverse_left_Triangle(5);
        NumberSeries ns=new NumberSeries();
        int n= ns.missing(1,2,3,4,6);
        System.out.println(n);
        Recursion re=new Recursion();
        re.factorial(5);
    }
}