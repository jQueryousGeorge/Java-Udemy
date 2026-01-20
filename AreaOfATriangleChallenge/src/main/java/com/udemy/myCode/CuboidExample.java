package com.udemy.mycode;
import java.util.Scanner;

/* 
    *** Prompt: Determine the [ total area ] of a cuboid based on its l, w, and h.
    * Height, length, and breadth must be given.
    * Must find the front/back area, the right/left area, and the bottom/top area.
    * Volume is equal to "len * breadth * height."
    * Total area is the total of all 6 sides.
    * INITIALLY, I though this was correct for total area: "Total area is the sum of the x, y, and z areas (right/left, bottom/top, & front/back) + the vol of the cuboid."
*/

public class CuboidExample {

    /* public static void Hexahedron(){
        Scanner sc = new Scanner(System.in);
        int frontBack, topBottom, rightLeft, height, length, breadth;
        long volume, totalArea;

        System.out.println("Hi! What is the height of the hexahedron?");
        height = sc.nextInt();

        System.out.println("Now, What is the length of the hexahedron?");
        length = sc.nextInt();

        System.out.println("Lastly, What is the breadth of the hexahedron?");
        breadth = sc.nextInt();
        System.out.println(" ");

        frontBack = length * height;
        rightLeft = breadth * height;
        topBottom = length * breadth;

        volume = length * breadth * height;

        totalArea = volume + (frontBack + rightLeft + topBottom);

        System.out.println("######## ###### ###### ######");
        System.out.println(" ");
        System.out.println("The TOTAL AREA of the cuboid is: -> -> " + totalArea);

    } */

    public static void CorrectAnswer() {
        Scanner sc = new Scanner(System.in);
        int length, width, height;
        int totalArea, volume;

        System.out.println("Hi! What is the height of the hexahedron?");
        height = sc.nextInt();

        System.out.println("Now, What is the length of the hexahedron?");
        length = sc.nextInt();

        System.out.println("Lastly, What is the breadth/width of the hexahedron?");
        width = sc.nextInt();
        System.out.println(" ");

        totalArea = 2 * (length * width + length * height + width * height);
        volume = length * width * height;

        System.out.println("######## ###### ###### ######");
        System.out.println(" ");
        System.out.println("The TOTAL AREA of the cuboid is: -> -> " + totalArea);
        System.out.println(" ");
        System.out.println("The VOLUME of the cuboid is: -> -> " + volume);
    }
    
    public static void main(String[] args) {
        CorrectAnswer();
    }
}