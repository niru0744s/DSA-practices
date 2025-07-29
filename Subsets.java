public class Subsets {
    public static void findSubSet(String str,int i, String ans){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        };

        //yes 
        findSubSet(str, i+1, ans+str.charAt(i));
        //no
        findSubSet(str, i+1, ans);
    }
    public static void main(String[]args){
        findSubSet("abc",0,"");
    }
}
