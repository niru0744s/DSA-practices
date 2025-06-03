public class bNDsStock {
    public static int stockProfit(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = 0; 
        for(int i=0 ; i<arr.length ; i++){
            if(buyPrice < arr[i]){
                int cp = arr[i] - buyPrice ;
                sellPrice = Math.max(cp , sellPrice);
            }else{
                buyPrice = arr[i];
            }
        };
        System.out.print(sellPrice);
        return sellPrice;
    }
    public static void main(String[]args){
        int arr[] = {7,1,5,3,6,4};
        stockProfit(arr);
    }
}
