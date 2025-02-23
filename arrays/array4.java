class small{
    public static void main(String[] args) {
        int[] num = {1,5,4,7,2};
        int smallest = num[0];
        for(int i = 0; i< num.length; i++){
            if(num[i] < smallest){
            smallest = num[i];}
        }
        System.out.println("largest num " + smallest);
    }
}