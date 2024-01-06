public class Question_2 {
//    Given N and i, check if ith bit position in N is set or not?
    public static void main(String[] args) {
        int n = 35;
        int i = 1;
        boolean checkBitAns = checkBit(n,i);
        System.out.println("Ans : "+checkBitAns);
    }
    static boolean checkBit(int n,int i){
        if(((n>>i)&1)==0){
            return false;
        }else{
            return true;
        }
    }
}
