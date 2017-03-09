package com.sdajava.sort_babelkowe;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tab = {4,7,8,3,5,4};
        int temp = 0;

        for (int i=0; i<tab.length; i+=2) {
            temp = tab[i];
            tab[i] = tab[i+1];
            tab[i+1] = temp;
        }
        System.out.println(Arrays.toString(tab));
    }
}
