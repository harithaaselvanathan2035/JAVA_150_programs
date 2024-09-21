//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;
class num{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter first number: ");
        int one = number.nextInt();
        System.out.println("enter two number: ");
        int two = number.nextInt();
        System.out.println("enter third number: ");
        int three = number.nextInt();
        
        int average = (one + two + three)/3;
        System.out.println("the average of three numbers : " + average);
    }
}