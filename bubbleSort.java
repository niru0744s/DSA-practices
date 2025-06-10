public class bubbleSort {
    public static void bubble(int arr[]){
        for(int i = 0; i<arr.length ; i++){
            for(int j =0 ; j<arr.length - 1 - i; j++){
                int temp = 0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0 ; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        int arr[] = {2,4,1,6,9,7};
        bubble(arr);
        print(arr);
    }
}
