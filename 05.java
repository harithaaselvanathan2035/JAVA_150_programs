//Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.Scanner;
class product{
    public static void main(String[] args) {
        Scanner pro = new Scanner(System.in);
        int a = pro.nextInt();
        int b = pro.nextInt();
        int c = a*b;
        System.out.print(a + " * " + b + " = " + c);
    }
}
