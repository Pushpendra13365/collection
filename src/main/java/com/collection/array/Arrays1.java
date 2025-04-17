package com.collection.array;
// array is a linear data structure.
// array can store same type of data, it is not dynamic in size,
// first of all we will declare the array and tell type and size of array
// allocation we will allocate the memory for an array, then we will initialize the array.
public class Arrays1 {
    public static void main(String[] args) {
        int [] arr;// declare the array
        arr = new int[5]; // memory allocation
        arr[0] = 10; // initialization
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 20;
        arr[5] = 50;
        System.out.println(arr[4]);
// we can access the data by index in array, index will start from 0 index, first element will store in 0 index.
// if we will try to access beyond the size of an array then we will get the ArrayIndexOutOfBoundException.
// mostly we use the array to traverse the elements one-by-one by using the loops.
// to read the size of array we use the length property.Note = length is property here not an method.
    }
}
