package com.company.revert;

import java.util.Stack;

public class RevertArray {
    public static int[] revertArr(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        int[] outputArr = new int[arr.length];

        for (int i = 0; i < outputArr.length; i++) {
            outputArr[i] = stack.pop();
        }
        return outputArr;

    }
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 5};
        int[] arr = {1, 2, 3, 4, 5,8,9};

        for (int i = 0; i < inputArr.length; i++) {
            System.out.println(RevertArray.revertArr(inputArr)[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(RevertArray.revertArr(arr)[i]);
        }
    }
}
