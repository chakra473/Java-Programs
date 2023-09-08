package RelevelProblems;

public class PatternProblems {
    void right_angle_triangle(){
        char k=65;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
                System.out.println();
        }
    }
    void inverse_right_angle_triangle(){
        char k=65;
        for(int i=5;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println();
        }
    }
    public static void left_triangle(int k)
    {
        int a, b;

        // 1st loop
        for (a = 0; a < k; a++) {

            // nested 2nd loop
            for (b = 2 * (k - a); b >= 0; b--) {
                // printing spaces
                System.out.print(" ");
            }

            // nested 3rd loop
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }
    public static void inverse_left_Triangle(int n)
    {
        int a, b;

        // 1st loop
        for (a = 0; a < n; a++) {

            // nested 2nd loop
            for (b = (n - a); b > 0; b--) {
                // printing spaces
                System.out.print("* ");
            }
            // end-line
            System.out.println();
        }
    }
}
