package Strings;

import java.util.Arrays;

public class RearrangeSubString {
    public static void rearrangeString(String inp1,String inp2){
        char[] str1=inp1.toCharArray();
        char[] str2=inp2.toCharArray();
        int length1=str1.length;
        int lenght2= str2.length;
        if(length1==lenght2){
            for(int i=0;i<lenght2;i++){
                if(str1[i]!=str2[i]){
                    str2[i]=str1[i];
                }
            }
            String out1= Arrays.toString(str1);
            String out2= Arrays.toString(str2);
            System.out.println(out1);
            System.out.println(out2);
        }else {
            System.out.println("length of both strings are not equal");
        }

    }
}
