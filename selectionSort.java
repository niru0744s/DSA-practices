public class selectionSort {
    public static void sSort(int arr[]){
       int n = arr.length;
       for(int i = 0 ; i<n-1; i++){
        int smallest = i;
        for(int j = i+1; j<n ; j++){
            if(arr[smallest] > arr[j]){
                smallest = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[smallest]; 
        arr[smallest] = temp;
       }
    }

    public static void print(int arr[]){
        for(int i=0 ; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[]args){
        int arr[] = {2,5,1,7,9,3};
        sSort(arr);
        print(arr);
    }
}
