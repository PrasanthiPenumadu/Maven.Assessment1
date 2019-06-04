package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
       /* int krem=k;
        int count=0;
        if(j<=k){
        for(int i=0;i<k;i=i+j){
            if(krem>=j) {
                count++;
                krem = krem - j;
            }} count= count+krem;
        }

           else if(j>k){
                for( int i=1;i<=k;i++)
                    count++;
        }

        return count;*/
       return k/j+k%j;
    }
}
