//finding gcd and lcm
class gcd{

int temp =0;
    int gcd(int a, int b){
        while(b!=0){
          temp = b;
          b = a%b;
          a =temp;
        }
        return a;
    }
    int lcm(int a, int b){
        return a*b / gcd(a, b);
    }
public static void main(String[] args) {
    
     gcd obj = new gcd();
     int res = obj.gcd(5, 6);
     int res1 = obj.lcm(5, 6);
     System.out.println(res);
     System.out.println(res1);

}
}