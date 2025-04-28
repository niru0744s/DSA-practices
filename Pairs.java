public class Pairs {
    public static void Pair(int n[]){
        int curr = 0;
        for(int i = 0; i<n.length; i++){
            curr = n[i];
            for(int j=i+1; j<n.length; j++){
                System.out.print("("+curr+","+n[j]+")");
            }
            System.out.println();
        }
        System.out.println("total num of pairs = "+ (n.length*(n.length-1))/2);
    }
    public static void main(String argc[]){
        int arr[] = {2,4,6,8,10};
        Pair(arr);
    }
}
