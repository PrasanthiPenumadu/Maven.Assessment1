package com.zipcodewilmington.assessment1.part5;

public class Palindrome {
    public boolean ispal(String input,int st,int end){
        if(st==end)
            return true;
        for(int i=0;i<=(end-st)/2;i++){
            if(input.charAt(i+st)!=input.charAt(end-i))
                return false;
        }return true;
    }

    public Integer countPalindromes(String input) {

       int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length() - 1; j >= i; j--) {
                if (input.charAt(i) == input.charAt(j)) {
                    if (ispal(input,i,j))
                        count++;

                }
            }
        }
        return count;
    }

}
