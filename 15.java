//Write a Java program to swap two variables.

class swap{
    public static void main(String[] args) {
        int temp;
        int a = 5;
        int b = 10;
         temp = a;
         a = b;
         b = temp;
         System.out.println(a);
         System.out.println(b);
         System.out.println(temp);
    }
}