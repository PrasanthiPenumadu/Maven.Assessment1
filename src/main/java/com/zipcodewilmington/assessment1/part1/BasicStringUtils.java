package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String str1=str.substring(0,1).toUpperCase()+str.substring(1);
        return str1;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String str2="";
        char arrStr[]=str.toCharArray();
        for(int i=arrStr.length-1;i>=0;i--)
            str2= str2+arrStr[i];
        return str2;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String str2=str.substring(str.length()-1).toUpperCase();
        char arrStr[]=str.toCharArray();
        for(int i=arrStr.length-2;i>=0;i--){
            str2= str2+arrStr[i];}
        return str2;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String str2="";
        char arrStr[]=str.toCharArray();
        for(int i=1;i<arrStr.length-1;i++)
            str2= str2+arrStr[i];
        return str2;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[]chars=str.toCharArray();
        for(int i=0;i<chars.length;i++) {
            chars[i] = Character.isUpperCase(chars[i]) ? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
