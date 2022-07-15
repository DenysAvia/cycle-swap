package com.epam.rd.autotasks;
import java.util.Arrays;


class CycleSwap {
    static void cycleSwap(int[] array) {
    if (array.length!=0) {int[] arrRes = new int[array.length];

    arrRes[0] = array[array.length -1];

        System.arraycopy(array, 0, arrRes, 1, array.length-1);
        System.arraycopy(arrRes, 0, array, 0, array.length);

        for(int x1:arrRes) {
            System.out.print(x1+" ");}
        }
    }

    static void cycleSwap(int[] array, int shift) {

        if (shift < array.length) {
            int[] arrRes = new int[array.length];



            System.arraycopy(array, array.length - shift, arrRes, 0, shift);
            System.arraycopy(array, 0, arrRes, shift, array.length - shift);
            System.arraycopy(arrRes, 0, array, 0, array.length);

            System.out.println(Arrays.toString(array));
        } else {System.out.println(Arrays.toString(array));}


    }
}