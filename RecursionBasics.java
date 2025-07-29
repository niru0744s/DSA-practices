public class RecursionBasics {
    public static void printDec(int n){
        System.out.print(n+" ");
        if(n==1){
            return;
        };
        printDec(n-1);
    };

    public static int fact(int n){
        if(n==0){
            return 1;
        };
        int fmn = fact(n-1);
        int fn = n*fmn;
        return fn;
    }

    public static int checkSum(int n){
        if(n==0){
            return 0;
        }
        int fmn = checkSum(n-1);
        int fn = n+fmn;
        return fn;
    };

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fmn1 = fib(n-1);
        int fmn2 = fib(n-2);
        int fn = fmn1 + fmn2;
        return fn;
    }

    public static boolean sortedArr(int arr[] , int i){
        if(arr.length-1 == i){
            return true;
        };

        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortedArr(arr, i+1);
    }

    public static int firstOcc(int arr[] , int key , int i){
        if(arr.length-1 == i){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOcc(arr, key, i+1);
    }

    public static int lastOccurance(int arr[] , int key , int i){
        if(arr.length == i){
            return -1;
        };

        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x , int n){
        if(n == 0){
            return 1;
        };
        return x * power(x, n-1);
    }

    public static int optimisedPow(int x , int n){
        if(n == 0){
            return 1;
        };

        int halfPow = optimisedPow(x, n/2);
        int mul = halfPow * halfPow;
        if( n % 2 != 0){
            mul = x * mul;
        };
        return mul;
    }

    public static int tilingProblem(int n){

        if(n == 0 || n == 1){
            return 1;
        };
        //vertical 
        int nm1 = tilingProblem(n-1);
        // horizontal 
        int nm2 = tilingProblem(n-2);

        // maximum ways 
        int nm = nm1 + nm2;
        return nm;
    }

    public static void removeDup(String str , int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.print(newStr);
            return;
        };

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDup(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDup(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return friendsPair(n-1) + (n-1) * friendsPair(n-2);
    }

    public static void occurence(int arr[],int key ,int i){
        if(arr.length == i){
            return;
        }
        
        if(arr[i] == key){
            System.out.print(i+" ");
        }

        occurence(arr, key, i+1);
    }

       public static void main(String[]args){
        int arr[]={2,3,1,5,7,8,5};
        removeDup("apnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
}
