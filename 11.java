
//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;



class circle{
    public static void main(String[] args) {
        Scanner cir = new Scanner(System.in);
        System.out.println("enter the radius:");
        float radius = cir.nextFloat();
        float area = (float) (radius*radius*3.14);
        float perimeter = (float) ( 2*3.14*radius);
        System.out.println("area of circle : " + area);
        System.out.println("perimeter of circle : " + perimeter);

    }
}