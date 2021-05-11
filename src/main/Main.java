/*
 * To change this license header, choose Li1
cense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

/**
 *
 * @author k_zeb
 */
public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int option;
        do{
        System.out.println("Option 1 =perimeter of a regtangle");
        System.out.println("Option 2 = area of a regtangle");
        System.out.println("Option 3 =permiter of a circle");
        System.out.println("Option 4 =area of a circle");
        System.out.println("Option 5 = exit");
        option = in.nextInt();
        if (option == 1) {
            System.out.println("what is the length?");
            double length = in.nextDouble();
            System.out.println("what is the width?");
            double width = in.nextDouble();
            System.out.println("The perimiter is " + width * 2 + length * 2);

        } else if (option == 2) {
            System.out.println("what is the length?");
            double length = in.nextDouble();
            System.out.println("what is the width?");
            double width = in.nextDouble();
            System.out.println("The area is " + length * width);
        } else if (option == 3) {
            System.out.println("What is the radius of your circle?");
            double radius = in.nextDouble();
            System.out.println("The permiter of your circle is " + 2 * Math.PI * radius);
        } else if (option== 4) {
            System.out.println ("What is the radius of your circle?");
            double radius =in.nextDouble();
            System.out.println("The area of your circle is "+Math.PI*radius*radius);
        }

        
        } while (option != 5);
        in.close();
    }
}
