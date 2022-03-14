package com.loop.tts;

public class Main {
    static int arr[] = {15, 34, 77, 3, 36};
    //method for sum of array
    static int sum()
    {
        int sum = 0;
        int i;
        // for loop to iterate sum of array elements
        for (i = 0; i < arr.length; i++ )
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
     System.out.println("Sum of all the values of this array is " + sum());
        double size= 5;
        double power= 2;
        System.out.println("5^2= " + Math.pow(size, power));
    }
}
