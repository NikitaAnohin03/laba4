package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array ");
        int a = in.nextInt();
        int[] nums = new int[a];
        for (var b = 0; b < a; b++) {
            nums[b] = in.nextInt();
        }
        int min = nums[0];
        for (var b = 0; b < a; b++) {
            if (min < nums[b]) {
                min = nums[b];
            }
        }
        int S = 0;
        for (var b = 0; b < a; b++) {
            S = S + nums[b];
        }
        System.out.println(S / a + min);
    }
}