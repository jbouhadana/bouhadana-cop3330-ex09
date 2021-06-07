/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        final int gallon = 350; // constant
        int length = jb.nextInt();
        int width = jb.nextInt();
        int jillibean = ((length*width) / gallon) + 1;
        System.out.println("You will need to purchase " + jillibean + " gallons of paint to cover "+ (length*width) + " square feet.");
    }
}
