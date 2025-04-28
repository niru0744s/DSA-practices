public class Reverse {
    public static void Rev(int numbers[]){
       int first = 0 , end = numbers.length-1;
       while(first<end){
        int temp = numbers[end];
        numbers[end] = numbers[first];
        numbers[first] = temp;
        first++;
        end--;
       }
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,7}; 
        Rev(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
