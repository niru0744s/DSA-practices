public class Main{

    public static int binToDec(int n){
        int pow = 0;
        int lastDig = 0;
        int sum = 0;
        while(n>0){
            lastDig = n%10;
            sum = sum + (lastDig * (int)Math.pow(2, pow));
            n = n/10;
            pow++;
        }
        return sum;
    }

    public static int decToBin(int n){
        int pow = 0;
        int bin = 0;
        while(n>0){
            int lastNum =  n%2;
            bin = bin +(lastNum * (int)Math.pow(10, pow));
            n = n/2;
            pow++;
        }
        return bin;
    }
    public static void main(String args[]){
       System.out.println(decToBin(5));
    }
}
