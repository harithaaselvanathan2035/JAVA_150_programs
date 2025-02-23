
import java.util.Scanner;

//palindrome
class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        int rev = 0;

        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println(rev);
        if(org == rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        }
    }
