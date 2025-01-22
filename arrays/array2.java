// finding maximium values
import java.util.Scanner;

class array2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int [] m = new int[n];

        System.out.println("enter the integers: ");
        for(int i=0; i<n; i++){
            m[i] = sc.nextInt();

        }
       int max = m[0];
       for(int i =1; i<n; i++){
        if(m[i] > max){
            max = m[i];
        }
       }
       System.out.println("max values is " + max);
    }
}