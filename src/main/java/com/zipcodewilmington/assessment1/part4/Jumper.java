package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int count=0;
        for(int i=0;i<=k;i=i+j){
            if(i<k)
            count++;

        }

        return count;
    }
}
