public class Subarrays {
    public static void printPairs(int n[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i<n.length ; i++ ){
        for(int j= i; j<n.length ; j++){
            int sum = 0;
            for(int k=i ; k<=j; k++){
                System.out.print(n[k]+" ");
                sum = sum + n[k];
            }
        System.out.println();
        min = Math.min(min , sum);
        max = Math.max(max ,sum);
        }
        System.out.println();
    }
    System.out.println("min sum " + min);
    System.out.println("max sum " + max);
}
    public static void main(String args[]){
        int arr [] = {1,2,3,4,5,6,7};
        printPairs(arr);
    }
}
