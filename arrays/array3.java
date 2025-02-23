class large{
    public static void main(String[] args) {
        int[] num = {1,5,4,7,2};
        int largest = 0;
        for(int i = 0; i< num.length; i++){
            if(num[i] > largest){
            largest = num[i];}
        }
        System.out.println("largest num " + largest);
    }
}