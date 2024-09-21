//Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;


class tables{
    public static void main(String[] args) {
        System.out.println("enter the num:");
        Scanner tab = new Scanner(System.in);
        int num = tab.nextInt();
        System.out.println("tables of " + num + " are ");
        for(int i = 1; i<=10; i++){
              int d = num * i;
              System.out.println(num + " * " + i + " = " + d);
        }
    }
}
