package com.day3;

public class oneTwoDimensionalArray {
	public static void main(String args[])
    {
        int[] a[] = { { 1, 1, 1 }, { 2, 2, 2 },
                     { 3, 3, 3 } }, b = { 20 };
  
         
        System.out.println(b[0]);
  
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = 100;
                System.out.println(a[i][j]);
            }
        }
    }

}
