package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] words=sentence.split(" ");
        return words;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] words=sentence.split(" ");
        return words[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] words=sentence.split(" ");
        String revWord=words[0];
        String revRes="";
        char[] wordStr=revWord.toCharArray();
        for(int i=wordStr.length-1;i>=0;i--){
            revRes=revRes+wordStr[i];}
        return revRes;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] words=sentence.split(" ");
        String revWord=words[0];
        String revRes="";
        char[] wordStr=revWord.toCharArray();
        for(int i=wordStr.length-1;i>=0;i--){
            revRes=revRes+wordStr[i];}
        String result=revRes.substring(0,1).toUpperCase()+revRes.substring(1);
        return result;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String s2=str.substring(0,index)+str.substring(index+1);
        return s2;
    }

}
