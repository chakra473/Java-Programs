package RelevelProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RegexPattern {
    void valid_check(String pass){
        final String NUMBERS="1234567890";
        final String LOWER_CASE="abcdefghijklmnopqrstuvwxyz";
        final String UPPER_CASE="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String SYMBOLS = "!@#$%^&*()_+~?><:{}|";
        String[] numbers=NUMBERS.split("");
        String[] symbols = SYMBOLS.split("");
        String[] lowerCase = LOWER_CASE.split("");
        String[] upperCase = UPPER_CASE.split("");
        String[] password = pass.split("");
        boolean isNumber = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSymbol = false;
        for(String pwd:password){
            if(Arrays.asList(numbers).contains(pwd)){
                isNumber=true;
            }
            if(Arrays.asList(symbols).contains(pwd)){
                isSymbol=true;
            }
            if(Arrays.asList(lowerCase).contains(pwd)){
                isLowerCase=true;
            }
            if(Arrays.asList(upperCase).contains(pwd)){
                isUpperCase=true;
            }
        }
        if((isNumber&&isSymbol)&&(isLowerCase&&isUpperCase)){
            System.out.println("password is valid");
        }
        else{
            System.out.println("password is invalid");
        }

    }
}
