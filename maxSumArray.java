public class maxSumArray {
    public static void kadansAlgo(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i<arr.length; i++){
            cs += arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[]args){
        int arr [] = {-1,-3,5,4,-1,-2};
        kadansAlgo(arr);
    }
}
