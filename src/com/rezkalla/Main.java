package com.rezkalla;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Product door = new Product("wooden door", 35);
        Product floorPanel = new Product("Floor Panel", 35);
        Product[] arr = {door, floorPanel};
        System.out.println(Arrays.toString(arr));
    }
}