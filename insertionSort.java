public class insertionSort {
    public static void insertion_Sort(int arr[]){
       for(int i = 1; i<arr.length  ; i++){
        int curr = arr[i];
        int prev = i-1;
        while(prev >= 0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--; 
        }
        arr[prev+1] = curr;
       }
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length -1; i++){
            System.out.println(arr[i]);
        }
    };

    public static void main(String[]args){
        int arr[] = {2,1,4,7,5,6};
        insertion_Sort(arr);
        print(arr);
    }
}
