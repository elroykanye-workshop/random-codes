package com.elroykanye;

public class Main {

    public static void main(String[] args) {
	    int[] sampleArr = new int[]{1,3,6,21,4,7,1,6,23,6,5,34,6,2,34};
        System.out.println(maxInArray(sampleArr));
    }

    private static int maxInArray(int[] T) {
        int N = T.length;
        if (N < 1) {
            System.out.println("Array is empty");
            return 0;
        } else if (N == 1) {
            return T[0];
        } else {
            int max = T[0];
            int index = 1;
            while (index < N) {
                if(T[index] > max) {
                    max = T[index];
                }
                index++;
            }
            return max;
        }
    }


}
