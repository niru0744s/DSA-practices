public class LinearSc {
    public static int linearSearch(int n[] , int key){
        for(int i=0 ; i<=n.length; i++){
            if(n[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {12,14,11,10,19,20};
        int res = linearSearch(arr , 11);
        if(res == -1){
            System.out.print("Not found");
        }else{
            System.out.print("value at " + res);
        }
    }
}
