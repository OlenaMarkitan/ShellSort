package com.marlen.java.lesson_1.Lesson7_1.Home7.Sorting.Shell_Sort;

/**
 * Created by Pysik on 13.03.2017.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {255,30, 2, 10, 4, 6, 0,7};
        int length = array.length;

        int inner, outer;
        int t;
        int h = 1;
        while (h <= length / 3)
            h = h * 3 + 1;
        while (h > 0)
        {
            for (outer = h; outer < length; outer++) {
                t = array[outer];
                inner = outer;

                while (inner > h - 1 && array[inner - h] >= t) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = t;
            }
            h = (h - 1) / 3;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

      