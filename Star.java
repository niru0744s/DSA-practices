public class Star {

    public static void pattern(int row , int col){
        for(int i = 1; i<=row; i++){
            for (int j = 1; j<= col; j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void ivertedPyra(int a){
        for(int i=1; i<=a;i++){
            for(int j = 1; j<=a-i;j++){
                    System.out.print(" ");
                }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ivtHalf(int a ){
        int d =1;
        for (int i=0 ; i<a; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" "+d);
                d++;
            }
            System.out.println();
        }
    }

    public static void binTri(int n){
        int a = 1;
        for(int i = 1; i<= n; i++){
            for(int j =1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPtn(int n){
        for(int i=1; i<=n ; i++){
            for(int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i>0; i--){
            for(int j=i ; j>0; j-- ){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rombus(int n){
        for(int i =1; i<=n; i++){
            for(int j=n ; j>= i ; j--){
                System.out.print(" ");
            };
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rombus(4);
    }
}
