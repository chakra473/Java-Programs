package Strings;
public class ReverseString {
    public void reverse_string(String word){
        char[] words=word.toCharArray();
        String reversed_string="";
        for(int i=word.length()-1;i>=0;i--){
            reversed_string=reversed_string+words[i];
        }
        System.out.println(word);
        System.out.println(reversed_string);
    }
    public void reverse_string_sentence(String word){
        String[] words=word.split(" ");
        String reversed_string="";
        for(int i=words.length-1;i>=0;i--){
            reversed_string=reversed_string+" "+words[i];
        }
        System.out.println(word);
        System.out.println(reversed_string);
    }
}
