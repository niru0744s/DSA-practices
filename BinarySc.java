public class BinarySc {
    public static int Binary(int numbers[] , int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(key > numbers[mid]){
                start = mid +1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7};
        int key = 3;

        System.out.print(Binary(numbers, key));
    }
}
