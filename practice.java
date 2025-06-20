public class practice {
   public static void bubbleSort(int arr[]){
    int n = arr.length;
    for(int i=0; i<n; i++){
        int temp = 0;
        for(int j=0; j<n-1-i; j++){
            if(arr[j+1]>arr[j]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
   }

   public static void selectionSort(int arr[]){
    int n = arr.length;
    for(int i=0; i<n; i++){
        int smallerst = i;
        for(int j=i+1; j<n; j++){
            if(arr[smallerst]<arr[j]){
                smallerst = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[smallerst];
        arr[smallerst] = temp;
    }
   }

   public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int next = i-1;
            while(next >= 0 && curr > arr[next]){
                arr[next+1] = arr[next];
                next--;
            }
            arr[next+1] = curr;
        }
   }

   public static void countSort(int arr[]){
    int n = arr.length;
    int largest = Integer.MIN_VALUE;
    for(int i=0 ; i<n; i++){
        largest = Math.max(largest,arr[i]);
    }

    int count[] = new int[largest+1];
    for(int i=0; i<n; i++){
        count[arr[i]]++;
    }

    int j=0;
    for(int i=count.length-1; i>=0; i--){
        while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
   }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    };

    public static void main(String[]args){
        int arr[] = {3,2,5,7,1,4};
        countSort(arr);
        print(arr);
    }
}
