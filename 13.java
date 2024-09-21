
import java.util.Scanner;

//Write a Java program to print the area and perimeter of a rectangle.

class rectangle{
    public static void main(String[] args) {
    Scanner rec = new Scanner(System.in);
    System.out.println("enter the radius:");
        float length = rec.nextFloat();
        float weight = rec.nextFloat();
        float area = (float) (length*weight);
        float perimeter = (float) ( 2*length+weight);
        System.out.println("area of rectangle : " + area);
        System.out.println("perimeter of rectangle : " + perimeter);
    }
}