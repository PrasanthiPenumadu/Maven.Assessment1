package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count=0;
        for(int i=0;i<objectArray.length;i++){
            if(objectArray[i].equals(objectToCount))
                count++;
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        ArrayList<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < objectArray.length - 1; i++) {
            if (!(objectArray[i] == objectToRemove)) {

                array1.add(objectArray[i]);
            }
        }
        System.out.println(array1);
        Integer arr[] = new Integer[array1.size()];
        for (int i = 0; i < array1.size(); i++)
            arr[i] = array1.get(i);

        return arr;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        int count=0;
        int max=0;
        int k=0;
    for(int i=0;i<objectArray.length;i++){
        for(int j=i+1;j<objectArray.length;j++){
            count=0;
            if(objectArray[i]==objectArray[j])
                count++;
        }if(count>max){
          max=count;
          k=objectArray[i] ;}
    }
        return k;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {
        int count=0;
        int min=2;
        Integer res=0;
        for(int i=0;i<objectArray.length;i++){
            count=0;
            for(int j=0;j<objectArray.length;j++){
                if(objectArray[i]==objectArray[j])
                    count++;
            }if(count<min){
                min=count;
                res=objectArray[i];
            }

        }return res;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        int k = objectArray.length + objectArrayToAdd.length;
        Integer arr[] = new Integer[k];
        int j=0;
        for (int i = 0; i < objectArray.length; i++)
            arr[i] = objectArray[i];
    for(int i=objectArray.length;i<k;i++){
        arr[i]=objectArrayToAdd[j];
    j++;}
        return arr;
    }
}
