package Strings;

public class OddAndReverse {
    void odd_reverse(String word){
        int wordLen=word.length();
        int middle=(wordLen-1)/2;
        String newWord=word.substring(middle)+word.substring(0,middle);
        System.out.println(newWord);
        for(int i=wordLen;i>=1;i--){
            newWord=newWord.substring(0,newWord.length()-1);
            newWord=" "+newWord;
            System.out.println(newWord);
        }
    }
}
