//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;
class arithmetic{
    public static void main(String[] args) {
        Scanner ari = new Scanner(System.in);
        int a = ari.nextInt();
        int b = ari.nextInt();
        int add = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + mod);
    }
}