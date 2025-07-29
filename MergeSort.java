public class MergeSort {
    public static void MergeFunc(int arr[], int si, int ei) {
        if(si >= ei){
            return;
        }
        int mid = si +(ei-si)/2;
        MergeFunc(arr, si, mid);
        MergeFunc(arr, mid+1, ei);
        Merge(arr, si, ei, mid);
    }

    public static void Merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<= mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        };

        for(int p=0 ; p<temp.length; p++){
            arr[si+p] = temp[p];
        }
    };

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    };

    public static void main(String[] args) {
        int arr[] = { 9, 3, 5, 2, 6, 8, 7 };
        MergeFunc(arr, 0, arr.length - 1);
        print(arr);
    }
}
