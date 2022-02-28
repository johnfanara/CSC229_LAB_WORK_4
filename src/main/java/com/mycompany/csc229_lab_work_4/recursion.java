/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_lab_work_4;

import static com.mycompany.csc229_lab_work_4.recursion.binarySearch;

/**
 *
 * @author johnf
 */
public class recursion {
        static void countDown(int num) { 
        if (num == 0) { //1             
            System.out.println("Blastoff!");
        }
        else if (num % 2 == 0) { //n
                System.out.println("..." + num);
                countDown(num-1); //n
            }
        else {
            System.out.println("...");
            countDown(num-1); // recursive call - n
        }
    }
    // 3n + 1 -> O(n) 
    
    static int gcd(int x, int y) {
        if (x % y == 0) { //base case
            return y;
        }
        else {
            return gcd(y, x % y);
        }
    }
    
    static int gcdSubtract(int x, int y) {
        if (x == 0) {
            return y;
        }
        while (y != 0) {
            if (x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        return x;
    }
    
    static int fib(int n) {
        if (n <= 0) { // base case
            return 0;
        }
        else if (n == 1) { // base case
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    // O(2^n) the larger n is, the longer the program will take to run
    
    //HOMEWORK
    static void printHello(int num) {
        if (num == 1) {
            System.out.println("Hello world");
        }
        else {
            System.out.println("Hello world");
            printHello(num-1);
            
        }
    }
    
    static int recurseSum(int n1, int n2) {
        if (n1 == n2) {
            return n1;
        }
        else {
            if (n1 % 7 == 0) {
                return n1 + recurseSum(n1 + 1, n2);
            }
            else {
                return recurseSum(n1 + 1, n2);
            }
        }
    }
    
    static int binarySearch(int[] nums, int search) {        
        int l = 0, r = nums.length - 1;        
        while (l <= r){
            int mid = (l + r) / 2;            
            if (search == nums[mid]) {
                return mid;
            }         
            else if (search < nums[mid]) {
                r = mid - 1;
            }            
            else {
                l = mid + 1;
            }
        }        
        return -1;
    }
       
    public static void main(String args[]) {
        countDown(9);
        System.out.println(gcd(54, 24)); //outputs greatest common divisor
        System.out.println(gcdSubtract(54, 24));
        System.out.println(fib(10));
        
        printHello(5);
        System.out.println(recurseSum(7, 77));
        
        int[] nums = {3, 7, 8, 14, 19, 24, 31, 36};
        int search = 19; 
        int index = binarySearch(nums, search);
 
        if (index != -1) {
            System.out.println("Number at index " + index);
        }
        
    }
}

