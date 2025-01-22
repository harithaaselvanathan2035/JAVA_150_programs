// getting input from user and storing in array 
// sorting the arrays in ascending order


import java.util.Arrays;
import java.util.Scanner;

class array1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("enter the size of an array: ");
        int m = sc.nextInt();
         int [] n = new int[m];

         for(int i =0; i<m; i++){
            n[i] = sc.nextInt();
         }
           for(int num : n){
            System.out.println(num);
           }
           Arrays.sort(n);
           System.out.println("sorted array : ");
           for(int num : n){
            System.out.println(num);
           }

    }
}
